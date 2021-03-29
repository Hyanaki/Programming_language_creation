package Lib3d;

import java.util.Vector ;

/** Représentation d'un objet 
 * 
 * @author flamarch
 *
 */
public class Object3d 
{
	/** Classe interne représentant un triangle 
	 * 
	 * @author flamarch
	 *
	 */
	public class Triangle implements Triangle3d
	{ 
		private int[] m_vertices ;
		private int[] m_normals ;
		private int[] m_textureCoordinates ;
		private Object3d m_object ;
		
		public Triangle(Object3d object, int[] vertices, int[] normals, int[] textureCoordinates)
		{
			m_object = object ;
			m_vertices = vertices ;
			m_normals = normals ;
			m_textureCoordinates = textureCoordinates ;
		}
		
		public Vector3d getVertex(int index) 
		{
			return m_object.getVertex(m_vertices[index]) ;
		}
		
		public Vector3d getVertexNormal(int index) 
		{
			return m_object.getVertexNormal(m_normals[index]) ;
		}
		
		public Vector2d getTextureCoordinate(int index) 
		{
			return m_object.getTextureCoordinates(m_textureCoordinates[index]) ;
		}

		public boolean hasVertexNormals()
		{
			return m_normals!=null ;
		}
				
		public boolean hasTextureCoordinates() 
		{
			return m_textureCoordinates!=null ;
		}

	}

	protected Vector<Vector3d> 		m_vertices = new Vector<Vector3d>() ;
	protected Vector<Vector3d> 		m_normals = new Vector<Vector3d>() ;
	protected Vector<Vector2d> 		m_textureCoordinates = new Vector<Vector2d>() ;
	protected Vector<Triangle3d>	m_triangles = new Vector<Triangle3d>() ;
	protected String				m_material = "";
	protected String				m_name = "" ;
	

	private static<T> boolean validateIndex(int index, Vector<T> v)
	{
		return index>=0 && index<v.size() ;
	}
	
	private static<T> boolean validateIndex(int[] index, Vector<T> v)
	{
		boolean result = true ;
		for(int cpt=0 ; cpt<index.length ; ++cpt)
		{
			result &= validateIndex(index[cpt], v) ;
		}
		return result ;
	}
	
	/** Construction d'un nouvel objet 3d
	 */
	public Object3d()
	{}

	/** Ajoute un sommet à l'objet 3d
	 * 
	 * @param vertex Le sommet à ajouter
	 * @return L'indice du sommet ajouté
	 */
	public int addVertex(Vector3d vertex)
	{
		m_vertices.add(vertex) ;
		return m_vertices.size()-1 ;
	}
	
	/** Ajoute une normale à l'objet 3D
	 * 
	 * @param normal La normale à ajouter
	 * @return L'indice de la normale ajoutée
	 */
	public int addNormal(Vector3d normal)
	{
		m_normals.add(normal) ;
		return m_normals.size()-1 ;
	}
	
	/** Ajoute un coordonnée de texture à l'objet
	 * 
	 * @param coord La coordonnée de texture
	 * @return L'indice de la coordonnée de texture ajoutée
	 */
	public int addTextureCoordinate(Vector2d coord)
	{
		m_textureCoordinates.add(coord) ;
		return m_textureCoordinates.size()-1 ;
	}

	/** Ajoute un nouveau triangle dans l'objet 3d
	 * 
	 * @param vertices Triplet d'indices de sommets correspondant au triangle
	 * @return L'indice du triangle ajouté
	 */
	public int addTriangle(int[] vertices)
	{
		assert(validateIndex(vertices, m_vertices)) ;
		m_triangles.addElement(new Triangle(this, vertices, null, null)) ;
		return m_triangles.size()-1 ;
	}
	
	/** Ajoute un nouveau triangle avec des normales par sommet
	 * 
	 * @param vertices Triplet d'indices des sommets
	 * @param normals Triplet d'indices des normales
	 * @return L'indice du triangle ajouté
	 */
	public int addTriangleWithNormals(int[] vertices, int[] normals)
	{
		assert(validateIndex(vertices, m_vertices)) ;
		assert(validateIndex(normals, m_normals)) ;		
		m_triangles.addElement(new Triangle(this, vertices, normals, null)) ;
		return m_triangles.size()-1 ;
	}

	/** Ajoute un nouveau triangle avec ses coordonnées de texture
	 * 
	 * @param vertices Triplet d'indices des sommets
	 * @param textureCoordinates Triplet d'indices des coordonnées de texture
	 * @return L'indice du triangle ajouté
	 */
	public int addTriangleWithTextureCoordinates(int[] vertices, int[] textureCoordinates)
	{
		assert(validateIndex(vertices, m_vertices)) ;
		assert(validateIndex(textureCoordinates, m_textureCoordinates)) ;		
		m_triangles.addElement(new Triangle(this, vertices, null, textureCoordinates)) ;
		return m_triangles.size()-1 ;		
	}
	
	/** Ajoute un nouveau triangle avec des normales au sommet et des coordonnées de texture
	 * 
	 * @param vertices Triplet d'indices des sommets
	 * @param normals Triplet d'indices des normales
	 * @param textureCoordinates Triplet d'indices des coordonnées de texture
	 * @return
	 */
	public int addTriangleWithNormalsAndTextureCoordinates(int[] vertices, int[] normals, int[] textureCoordinates)
	{
		assert(validateIndex(vertices, m_vertices)) ;
		assert(validateIndex(normals, m_normals)) ;		
		assert(validateIndex(textureCoordinates, m_textureCoordinates)) ;	
		m_triangles.addElement(new Triangle(this, vertices, normals, textureCoordinates)) ;
		return m_triangles.size()-1 ;		
	}
	
	/** Récupération d'un sommet par son indice
	 * 
	 * @param index
	 * @return
	 */
	public Vector3d getVertex(int index)
	{
		assert(validateIndex(index, m_vertices)) ;
		return m_vertices.get(index) ;
	}
	
	/** Récupération d'une normale via son indice
	 * 
	 * @param index
	 * @return
	 */
	public Vector3d getVertexNormal(int index)
	{
		assert(validateIndex(index, m_normals)) ;
		return m_normals.get(index) ;
	}
	
	/** Récupération d'une coordonnée de texture via son indice
	 * 
	 * @param index
	 * @return
	 */
	public Vector2d getTextureCoordinates(int index)
	{
		assert(validateIndex(index, m_textureCoordinates)) ;
		return m_textureCoordinates.get(index) ;
	}

	/** Permet de savoir si l'objet utilise des normales au sommet
	 * 
	 * @return
	 */
	public boolean hasVertexNormals()
	{
		return m_normals.size()!=0 ;
	}
	
	/** Permet de savoir si l'objet possède des coordonnées de texture
	 * 
	 * @return
	 */
	public boolean hasTextureCoordinates()
	{
		return m_textureCoordinates.size()!=0 ;
	}
	
	/** Récupération du triangle d'indice fourni
	 * 
	 * @param index
	 * @return
	 */
	public Triangle3d getTriangle(int index)
	{
		return m_triangles.get(index) ;
 	}
	
	/** Récupération de la table des sommets
	 * 
	 * @return
	 */
	public Vector<Vector3d> getVertices()
	{
		return m_vertices ;
	}
	
	/** Récupération de la table des normales
	 * 
	 * @return
	 */
	public Vector<Vector3d> getNormals() 
	{
		return m_normals ;
	}
	
	/** Récupération de la table des coordonnées de texture 
	 * 
	 * @return
	 */
	public Vector<Vector2d> getTextureCoordinates()
	{
		return m_textureCoordinates ;
	}
	
	public Vector<Triangle3d> getTriangles()
	{
		return m_triangles ;
	}
	
	/** Change le nom du matériau associé à l'objet
	 * 
	 * @param material
	 */
	public void setMaterial(String material)
	{
		m_material = material ;
	}
	
	/** Récupération du matériau associé à l'objet
	 * 
	 * @return
	 */
	public String getMaterial()
	{
		return m_material ;
	}
	
	/** Change de nom de l'objet 
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		m_name = name ;
	}
	
	/** Récupération du nom de l'objet
	 *  
	 * @return
	 */
	public String getName()
	{
		return m_name ;
	}
}
