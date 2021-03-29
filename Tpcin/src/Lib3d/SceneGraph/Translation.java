package Lib3d.SceneGraph;

import Lib3d.Vector3d ;

/** Repr�sentation d'un noeud translation du graphe de sc�ne
 * 
 * @author flamarch
 *
 */
public interface Translation extends Transform
{
	/** Change le vecteur de translation associ� � ce noeud transform
	 * 
	 * @param translation
	 */
	void setTranslation(Vector3d translation) ;
	
	/** R�cup�ration du vecteur de translation associ� � ce noeud 
	 * 
	 * @return
	 */
	Vector3d getTranslation() ;
}
