package Lib3d;

/** Représentation d'un triangle en 3D
 * 
 * @author flamarch
 *
 */
public interface Triangle3d
{
	/** Récupération du sommet d'indice index
	 * 
	 * @param index
	 * @return
	 */
	Vector3d getVertex(int index) ;

	/** Permet de savoir si des normales sont associées aux sommets du triangle
	 * 
	 * @return
	 */
	boolean hasVertexNormals();
	
	/** Récupération de la normale au sommet d'indice index
	 * 
	 * @param index
	 * @return
	 */
	Vector3d getVertexNormal(int index) ;
	
	/** Permet de savoir si des coordonnées de texture sont associées aux sommets du triangle
	 * 
	 * @return
	 */
	boolean hasTextureCoordinates() ;
	
	/** Récupération des coordonnées de textures associées au sommet d'indice index
	 * 
	 * @param index
	 * @return
	 */
	Vector2d getTextureCoordinate(int index) ;
}