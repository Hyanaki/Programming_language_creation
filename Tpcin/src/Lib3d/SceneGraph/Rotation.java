package Lib3d.SceneGraph;

import Lib3d.Vector3d; 

/** Représentation d'une transformation de type Rotation
 * 
 * @author flamarch
 *
 */
public interface Rotation extends Transform
{
	/** Change l'axe de rotation
	 * 
	 * @param axis Le nouvel axe de rotation
	 */
	void setAxis(Vector3d axis) ;
	
	/** Récupération de l'axe de rotation
	 * 
	 * @return
	 */
	Vector3d getAxis() ;
	
	/** Change l'angle de rotation
	 * 
	 * @param angle Le nouvel angle de rotation (en degré)
	 */
	void setAngle(float angle) ;
	
	/** Renvoie l'angle de rotation autour de l'axe
	 * 
	 * @return L'angle de rotation (en degré)
	 */
	float getAngle() ;
}
