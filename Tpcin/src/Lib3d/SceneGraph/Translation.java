package Lib3d.SceneGraph;

import Lib3d.Vector3d ;

/** Représentation d'un noeud translation du graphe de scène
 * 
 * @author flamarch
 *
 */
public interface Translation extends Transform
{
	/** Change le vecteur de translation associé à ce noeud transform
	 * 
	 * @param translation
	 */
	void setTranslation(Vector3d translation) ;
	
	/** Récupération du vecteur de translation associé à ce noeud 
	 * 
	 * @return
	 */
	Vector3d getTranslation() ;
}
