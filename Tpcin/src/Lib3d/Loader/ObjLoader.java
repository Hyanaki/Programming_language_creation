package Lib3d.Loader;

import java.util.Vector;

import Lib3d.Color;
import Lib3d.Object3d;
import Lib3d.Vector3d; 
import Lib3d.Vector2d; 
import Lib3d.MaterialLib;
import Lib3d.Material; 
import java.io.DataInputStream ;
import java.io.FileInputStream ;
import java.io.InputStream;
import java.io.IOException;

public class ObjLoader 
{
	// Les séparateurs utilisés pour le parsing
	static String lineSeparator = "[\n\r]+" ;
	static String argumentSeparator = "[ ]+" ;
	static String indexSeparator = "/" ;
	// Les commandes reconnues pour les objets
	static String commandEndGroup = "g" ;
	static String commandObjectName = "g" ;
	static String commandFace = "f" ;
	static String commandVertex = "v" ;
	static String commandVertexNormal = "vn" ;
	static String commandTextureCoordinate = "vt" ;
	static String commandMaterial = "usemtl" ;
	// Les commandes reconnues pour les textures
	static String commandDeclareMaterial = "newmtl" ;
	static String commandMapTextureKd = "map_Kd" ;
	static String commandKa = "Ka" ;
	static String commandKd = "Kd" ;
	static String commandKs = "Ks" ;
	static String commandD = "d" ;
	static String commandNs = "Ns" ;
	static String commandTextureScale = "s" ;
	
	/** Découpe une ligne contenant une commande en s'appuyant sur les espaces
	 * 
	 * @param command La ligne de commande à découper
	 * @return Une table contenant chacun des morceaux de la ligne de commande
	 */
	private static String[] cutCommand(String command)
	{
		return command.split(argumentSeparator) ;
	}
	
	/** Extrait des groupes de commandes correspondant à la construction d'un objet
	 * 
	 * @param commands Les commandes à grouper
	 * @return Un vecteur regroupant les commandes associées à un objet spécifique
	 */
	private static Vector<Vector<String[]>> groupObjectCommands(Vector<String> commands)
	{
		Vector<Vector<String[]>> result = new Vector<Vector<String[]>>();
		result.addElement(new Vector<String[]>()) ;
		for(int cpt=0 ; cpt<commands.size() ; ++cpt)
		{
			String[] command = cutCommand(commands.get(cpt)) ;
			if(command[0].equals(commandEndGroup) && command.length==1)
			{
				result.addElement(new Vector<String[]>()) ;
			}
			else
			{
				result.lastElement().addElement(cutCommand(commands.get(cpt))) ;
			}
		}
		return result ;
	}
	
	/** Extrait l'ensemble des indices passés comme paramètre de la commande de description de face
	 * 
	 * @param command La commande
	 * @return Les indices
	 */
	private static Vector<Integer> extractAllFaceArguments(String[] command)
	{
		assert command[0].equals(commandFace) : "extractAllFaceArguments: invalid command parameter" ;
		Vector<Integer> result = new Vector<Integer>() ;
		for(int cpt=1 ; cpt<command.length ; ++cpt)
		{
			String[] tmp = command[cpt].split(indexSeparator) ;
			for(int k=0 ; k<tmp.length ; ++k)
			{
				result.addElement(Integer.parseInt(tmp[k])) ;
			}
		}
		return result ;
	}
	
	/** Parse une commande de descrption de faces et ajoute cette dernière à un objet 3d
	 * 
	 * @param result L'objet dans lequel ajouter la face
	 * @param command La commande de description de la face
	 */
	private static void parseFaceWithNormalsAndTextureCoordinates(Object3d result, String[] command, int[] elementsCount) 
	{
		Vector<Integer> arg = extractAllFaceArguments(command) ;
		int[] vertices = {arg.get(0)-elementsCount[0], arg.get(3)-elementsCount[0], arg.get(6)-elementsCount[0]} ;
		int[] normals = {arg.get(2)-elementsCount[1], arg.get(5)-elementsCount[1], arg.get(8)-elementsCount[1]} ;
		int[] textureCoordinates = {arg.get(1)-elementsCount[2], arg.get(4)-elementsCount[2], arg.get(7)-elementsCount[2]} ;
		result.addTriangleWithNormalsAndTextureCoordinates(vertices, normals, textureCoordinates) ;
	}
	
	/** Parse une commande de descrption de faces et ajoute cette dernière à un objet 3d
	 * 
	 * @param result L'objet dans lequel ajouter la face
	 * @param command La commande de description de la face
	 */
	private static void parseFaceWithNormals(Object3d result, String[] command, int[] elementsCount) 
	{
		Vector<Integer> arg = extractAllFaceArguments(command) ;
		int[] vertices = {arg.get(0)-elementsCount[0], arg.get(2)-elementsCount[0], arg.get(4)-elementsCount[0]} ;
		int[] normals = {arg.get(1)-elementsCount[1], arg.get(3)-elementsCount[1], arg.get(5)-elementsCount[1]} ;
		result.addTriangleWithNormals(vertices, normals) ;
	}
	
	/** Parse une commande de descrption de faces et ajoute cette dernière à un objet 3d
	 * 
	 * @param result L'objet dans lequel ajouter la face
	 * @param command La commande de description de la face
	 */
	private static void parseFaceWithTextureCoordinates(Object3d result, String[] command, int[] elementsCount) 
	{
		Vector<Integer> arg = extractAllFaceArguments(command) ;
		int[] vertices = {arg.get(0)-elementsCount[0], arg.get(2)-elementsCount[0], arg.get(4)-elementsCount[0]} ;
		int[] textureCoordinates = {arg.get(1)-elementsCount[2], arg.get(3)-elementsCount[2], arg.get(5)-elementsCount[2]} ;
		result.addTriangleWithTextureCoordinates(vertices, textureCoordinates) ;
	}
	
	/** Parse une commande de descrption de faces et ajoute cette dernière à un objet 3d
	 * 
	 * @param result L'objet dans lequel ajouter la face
	 * @param command La commande de description de la face
	 */
	private static void parseFace(Object3d result, String[] command, int[] elementsCount) 
	{
		Vector<Integer> arg = extractAllFaceArguments(command) ;
		int[] vertices = {arg.get(0)-elementsCount[0], arg.get(1)-elementsCount[0], arg.get(2)-elementsCount[0]} ;
		result.addTriangle(vertices) ;		
	}
	
	/** Crée un objet 3d à partir des commandes le décrivant
	 * 
	 * @param commands
	 * @return
	 */
	private static Object3d createObject(Vector<String[]> commands, int[] elementsCount)
	{
		Object3d result = new Object3d() ;
		for(int cpt=0 ; cpt<commands.size(); ++cpt)
		{
			String[] command = commands.get(cpt);
			if(command[0].equals(commandVertex))
			{
				float x = Float.parseFloat(command[1]) ;
				float y = Float.parseFloat(command[2]) ;
				float z = Float.parseFloat(command[3]) ;
				result.addVertex(new Vector3d(x,y,z)) ;
			} 
			else if(command[0].equals(commandVertexNormal))
			{
				float x = Float.parseFloat(command[1]) ;
				float y = Float.parseFloat(command[2]) ;
				float z = Float.parseFloat(command[3]) ;
				result.addNormal(new Vector3d(x,y,z)) ;
			} 
			else if(command[0].equals(commandTextureCoordinate))
			{
				float u = Float.parseFloat(command[1]) ;
				float v = Float.parseFloat(command[2]) ;
				result.addTextureCoordinate(new Vector2d(u,v)) ;
			} 
			else if(command[0].equals(commandFace))
			{
				if(result.hasVertexNormals() && result.hasTextureCoordinates())
				{
					parseFaceWithNormalsAndTextureCoordinates(result, command, elementsCount) ;
				}
				else if(result.hasVertexNormals())
				{
					parseFaceWithNormals(result, command, elementsCount) ;
				}
				else if(result.hasTextureCoordinates())
				{
					parseFaceWithTextureCoordinates(result, command, elementsCount) ;
				}
				else
				{
					parseFace(result, command, elementsCount) ;
				}
			}
			else if(command[0].equals(commandObjectName))
			{
				result.setName(command[1]) ;
			}
			else if(command[0].equals(commandMaterial))
			{
				result.setMaterial(command[1]) ;
			}
			else
			{
				System.out.println("Loader.ObjLoader: unable to interpret command "+command[0]);
			}
		}
		return result ;
	}
	
	/** Extrait l'ensemble des commandes contenues dans un fichier dont le nom est passé en paramètre
	 * 
	 * @param fileName Le nom du fichier de commandes
	 * @return Une table contenant les commandes
	 * @throws IOException Ben ouais...
	 */
	private static Vector<String> extractCommands(String fileName) throws IOException
	{
		// Lecture du fichier
		InputStream input = new DataInputStream(new FileInputStream(fileName)) ;
		int size = input.available() ;
		byte[] file = new byte[size] ;
		input.read(file) ;
		String fileString = new String(file) ;
		// Extraction de chaque ligne du fichier
		String[] commands = fileString.split(lineSeparator) ; 
		// Construit l'ensemble des commandes résultat en supprimant les commentaires et les lignes vides éventuelles
		Vector<String> filteredCommands = new Vector<String>() ;
		for(int cpt=0 ; cpt<commands.length ; ++cpt)
		{
			// Suppression des espaces en début et fin
			commands[cpt] = commands[cpt].trim() ;
			// On ne conserve que les commandes "interprétables"
			if(commands[cpt].compareTo("")!=0 && commands[cpt].charAt(0)!='#')
			{
				filteredCommands.addElement(commands[cpt]) ;
			}
		}
		return filteredCommands ;
	}
	
	/** Charge un fichier Obj dont le nom est fourni en paramètre
	 * 
	 * @param fileName Le nom du fichier obj à charger
	 * @return L'ensemble des objets décrits dans le fichier
	 * @throws IOException Si problème de lecture du fichier
	 */
	public static void load(String fileName, Vector<Object3d> result) throws IOException 
	{
 		//Vector<Object3d> result = new Vector<Object3d>() ;
		Vector<Vector<String[]>> commandsGroups = groupObjectCommands(extractCommands(fileName)) ;
		int[] elementCount = {1, 1, 1} ;
		
		for(int cpt=0 ; cpt<commandsGroups.size() ; ++cpt)
		{
			Object3d obj = createObject(commandsGroups.get(cpt), elementCount) ;
			if(obj.getVertices().size()!=0)
			{
				result.addElement(obj) ;
				elementCount[0] += obj.getVertices().size() ;
				elementCount[1] += obj.getNormals().size() ;
				elementCount[2] += obj.getTextureCoordinates().size() ;
			}
		}
		//return result ;
	}
	
	private static Vector<Vector<String[]>> groupMaterialCommands(Vector<String> commands)
	{
		Vector<Vector<String[]>> result = new Vector<Vector<String[]>>() ;
		for(int cpt=0 ; cpt<commands.size() ; ++cpt)
		{
			String[] command = cutCommand(commands.get(cpt)) ;
			if(command[0].equals(commandDeclareMaterial))
			{
				result.add(new Vector<String[]>()) ;
			}
			result.lastElement().add(command) ;
		}
		return result ;
	}
	
	private static Material createMaterial(Vector<String[]> commands)
	{
		String identifier = null ; 
		Color Ka = null ;
		Color Kd = null ;
		Color Ks = null ;
		float d = 1.0f ;
		float Ns = 1.0f ;
		String textureFile = null ;
		Vector2d textureScale = new Vector2d(1.0f, 1.0f) ;
		
		for(int cpt=0 ; cpt<commands.size() ; ++cpt)
		{
			String[] command = commands.get(cpt) ;
			if(command[0].equals(commandDeclareMaterial))
			{
				identifier = command[1] ;
			}
			else if(command[0].equals(commandMapTextureKd))
			{
				textureFile = command[command.length-1] ;
				if(command[1].equals(commandTextureScale))
				{
					textureScale = new Vector2d(Float.parseFloat(command[2]), Float.parseFloat(command[3])) ;
				}
			}
			else if(command[0].equals(commandKa))
			{
				Ka = new Color(Float.parseFloat(command[1]), Float.parseFloat(command[2]), Float.parseFloat(command[3])) ;
			}
			else if(command[0].equals(commandKd))
			{
				Kd = new Color(Float.parseFloat(command[1]), Float.parseFloat(command[2]), Float.parseFloat(command[3])) ;				
			}
			else if(command[0].equals(commandKs))
			{
				Ks = new Color(Float.parseFloat(command[1]), Float.parseFloat(command[2]), Float.parseFloat(command[3])) ;				
			}
			else if(command[0].equals(commandD))
			{
				d = Float.parseFloat(command[1]) ;
			}
			else if(command[0].equals(commandNs))
			{
				Ns = Float.parseFloat(command[1]) ;
			}
			else
			{
				System.out.println("Loader.ObjLoader: unable to interpret command "+command[0]);				
			}
		}	
		return new Material(identifier, Ka, Kd, Ks, d, Ns, textureScale, textureFile) ;
	}
	
	/** Charge une librairie de matériaux à partir du nom de son fichier
	 * 
	 * @param fileName Le nom du fichier contenant la librairie
	 * @param lib La librairie à remplir à partir du fichier
	 * @throws IOException Si problème de lecture du fichier
	 */
	public static void load(String fileName, MaterialLib lib) throws IOException
	{
		Vector<Vector<String[]>> commands = groupMaterialCommands(extractCommands(fileName)) ;
		for(int cpt=0 ; cpt<commands.size() ; ++cpt)
		{
			lib.addMaterial(createMaterial(commands.get(cpt))) ;
		}
	}
}
