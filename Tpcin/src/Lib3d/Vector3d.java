package Lib3d;

import java.nio.FloatBuffer ;

/** Classe représentant un vecteur à trois dimensions
 * 
 * @author flamarch
 *
 */
public class Vector3d 
{
	protected float[] m_coordinates ;
	
	/** Construction d'un vecteur à 3 dimensions
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3d(float x, float y, float z)
	{
		m_coordinates = new float[3] ;
		m_coordinates[0] = x ;
		m_coordinates[1] = y ;
		m_coordinates[2] = z ;
	}
	
	public float get(int dimension)
	{
		return m_coordinates[dimension] ;
	}
	
	/** Converti cet objet en FloatBuffer pour la compatibilité avec l'API openGL
	 * 
	 * @return
	 */
	public FloatBuffer toBuffer()
	{
		return FloatBuffer.wrap(m_coordinates) ;
	}
	
	/** Produit scalaire entre deux vecteurs
	 * 
	 * @param v
	 * @param v2
	 * @return
	 */
	public float dot(Vector3d v, Vector3d v2)
	{
		float result = 0.0f ;
		for(int cpt=0 ; cpt<3 ; ++cpt)
		{
			result += v.m_coordinates[cpt]*v2.m_coordinates[cpt] ;
		}
		return result ;
	}
	
	/** Multiplication vecteur / scalaire
	 * 
	 * @param v
	 * @param value
	 * @return
	 */
	public static Vector3d mul(Vector3d v, float value)
	{
		return new Vector3d(v.m_coordinates[0]*value, v.m_coordinates[1]*value, v.m_coordinates[2]*value) ;
	}
	
	/** Multiplication coordonnée par coordonnée de deux vecteurs 3D 
	 * 
	 * @param v
	 * @param v2
	 * @return
	 */
	public static Vector3d mul(Vector3d v, Vector3d v2)
	{
		return new Vector3d(v.m_coordinates[0]*v2.m_coordinates[0], v.m_coordinates[1]*v2.m_coordinates[1], v.m_coordinates[2]*v2.m_coordinates[2]) ; 
	}
	
	/** Addition de deux vecteurs
	 * 
	 * @param v
	 * @param v2
	 * @return
	 */
	public static Vector3d add(Vector3d v, Vector3d v2)
	{
		return new Vector3d(v.m_coordinates[0]+v2.m_coordinates[0], v.m_coordinates[1]+v2.m_coordinates[1], v.m_coordinates[2]+v2.m_coordinates[2]) ;
	}

	/** Renvoie l'opposé du vecteur 
	 * 
	 * @param v
	 * @return
	 */
	public static Vector3d neg(Vector3d v)
	{
		return new Vector3d(-v.m_coordinates[0], -v.m_coordinates[1], -v.m_coordinates[2]) ;
	}
	
	/** Soustraction de deux vecteurs
	 * 
	 * @param v
	 * @param v2
	 * @return
	 */
	public static Vector3d sub(Vector3d v, Vector3d v2)
	{
		return add(v, neg(v2)) ;
	}
}
