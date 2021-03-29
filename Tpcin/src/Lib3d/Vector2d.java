package Lib3d;

import java.nio.FloatBuffer ;

/** Représentation d'un vecteur en deux dimensions
 * 
 * @author flamarch
 *
 */
public class Vector2d 
{
	protected float[] m_coordinates ;
	
	/** Construction d'un vecteur 2D
	 * 
	 * @param x
	 * @param y
	 */
	public Vector2d(float x, float y)
	{
		m_coordinates = new float[2] ;
		m_coordinates[0] = x ;
		m_coordinates[1] = y ;
	}
	
	/** Récupération d
	 * 
	 * @param dimension
	 * @return
	 */
	float get(int dimension)
	{
		return m_coordinates[dimension] ;
	}
	
	/** Transforme le vecteur en FloatBuffer (utile pour jogl) 
	 * 
	 * @return
	 */
	FloatBuffer toBuffer()
	{
		return FloatBuffer.wrap(m_coordinates) ;
	}
	
	/** Rotation d'un vecteur 2D
	 * 
	 * @param v Le vecteur à faire tourner
	 * @param angle L'angle de rotation
	 * @return
	 */
	static Vector2d rotate(Vector2d v, float angle)
	{
		Vector2d result = new Vector2d(0.0f, 0.0f) ;
		result.m_coordinates[0] = (float)Math.cos(angle)*v.m_coordinates[0]-(float)Math.sin(angle)*v.m_coordinates[1] ;
		result.m_coordinates[1] = (float)Math.sin(angle)*v.m_coordinates[0]+(float)Math.cos(angle)*v.m_coordinates[1] ;
		return result ;
	}
	
	/** Multiplication d'un vecteur par un scalaire
	 * 
	 * @param v
	 * @param value
	 * @return
	 */
	static Vector2d mul(Vector2d v, float value)
	{
		return new Vector2d(v.m_coordinates[0]*value, v.m_coordinates[1]*value) ;
	}
	
	/** Multiplication coordonnée par coordonnée de deux vecteurs 
	 * 
	 * @param v 
	 * @param v2
	 * @return
	 */
	static Vector2d mul(Vector2d v, Vector2d v2)
	{
		return new Vector2d(v.m_coordinates[0]*v2.m_coordinates[0], v.m_coordinates[1]*v2.m_coordinates[1]) ; 
	}
	
	/** Addition de deux vecteurs
	 * 
	 * @param v
	 * @param v2
	 * @return
	 */
	static Vector2d add(Vector2d v, Vector2d v2)
	{
		return new Vector2d(v.m_coordinates[0]+v2.m_coordinates[0], v.m_coordinates[1]+v.m_coordinates[1]) ;
	}
	
	/** Renvoie l'opposé du vecteur
	 * 
	 * @param v
	 * @return
	 */
	static Vector2d neg(Vector2d v)
	{
		return new Vector2d(-v.m_coordinates[0], -v.m_coordinates[1]) ;
	}
	
	/** Soustraction de deux vecteurs
	 * 
	 * @param v
	 * @param v2
	 * @return
	 */
	static Vector2d sub(Vector2d v, Vector2d v2)
	{
		return add(v, neg(v2)) ;
	}
}
