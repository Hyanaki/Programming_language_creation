package Lib3d;

import java.io.IOException;
import java.util.HashMap ;
import java.util.Iterator ;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2; //il ne connait pas l'autre  javax.media.opengl.GL;
 
/** Librairie de materiaux
 * 
 * @author flamarch
 *
 */
public class MaterialLib 
{
	protected HashMap<String, Material> m_map = new HashMap<String, Material>() ;
	protected HashMap<String, Integer> m_textureMap = new HashMap<String, Integer>() ;
	//protected MyMap<String, Material> m_map = new MyMap<String, Material>() ;
//	protected MyMap<String, Integer> m_textureMap = new MyMap<String, Integer>() ;
	
	protected String m_texturePath = "" ;
	
	/** Construction d'une librairie de matériaux
	 */
	public MaterialLib()
	{
	}
	
	/** Ajoute un materiau dans la librairie 
	 * 
	 * @param name
	 * @param material
	 */
	public void addMaterial(Material material)
	{
		m_map.put(material.getIdentifier(), material) ;
	}
	
	/** Permet de récupérer un matériau à  partir de son nom
	 * 
	 * @param name Le nom du materiau 
	 * @return Le materiau correspondant à l'identifiant
	 */
	public Material getMaterial(String identifier)
	{
		assert(m_map.containsKey(identifier)) ;		
		return m_map.get(identifier) ;
	}
	
	/** Fourni le chemin de recherche des textures
	 * 
	 * @param texturePath
	 */
	public void setTexturePath(String texturePath)
	{
		m_texturePath = texturePath ;
	}
	
	/** Permet d'enregistrer les textures dans OpenGL
	 * 
	 * @param gl
	 */
	public void registerTextures(GL gl)
	{
		Iterator<Material> it = m_map.values().iterator() ;
		while(it.hasNext())
		{
			Material material = it.next() ;
			String texture = material.getTextureFile() ;
			// Si la texture existe et n'est pas déjà référencée on la référence
			if(texture!=null && !m_textureMap.containsKey(texture))
			{
				try
				{
					System.out.println("Loading texture "+m_texturePath + "/" + texture) ;
					Texture tmp = Lib3d.Loader.TextureLoader.load(m_texturePath + "/" + texture) ;
					int id = TextureRegister.register(gl, tmp) ;
					m_textureMap.put(texture, id) ;
				}
				catch(IOException e)
				{
					System.out.println("Unable to load texture: " + m_texturePath + "/" + texture) ;
				}
			}
			if(m_textureMap.containsKey(texture))
			{
				material.setTextureId(m_textureMap.get(texture)) ;
				System.out.println("Registered texture "+m_textureMap.get(texture)+" for material "+material.getIdentifier()) ;
			}
		}
	}
}
