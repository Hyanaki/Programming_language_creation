package Lib3d;


/** Classe représentant une couleur
 * 
 * @author flamarch
 *
 */
public class Color extends Vector3d
{	
	/** Construction d'une nouvelle couleur
	 * 
	 * @param red
	 * @param green
	 * @param blue
	 */
	public Color(float red, float green, float blue)
	{
		super(red,green,blue) ;
		assert(red>=0.0 && red<=1) ;
		assert(green>=0.0 && green<=1) ;
		assert(blue>=0.0 && blue<=1) ;
	}
	
	/** Récupération de la composante rouge
	 * 
	 * @return
	 */
	public float getRed()
	{
		return m_coordinates[0] ;
	}
	
	/** Récupération de la composante verte
	 * 
	 * @return
	 */
	public float getGreen()
	{
		return m_coordinates[1] ;
	}
	
	/** Récupération de la composante bleue
	 * 
	 * @return
	 */
	public float getBlue()
	{
		return m_coordinates[2] ;
	}

}
