package Lib3d;

/** Repr�sentation d'un triangle en 3D
 * 
 * @author flamarch
 *
 */
public interface Triangle3d
{
	/** R�cup�ration du sommet d'indice index
	 * 
	 * @param index
	 * @return
	 */
	Vector3d getVertex(int index) ;

	/** Permet de savoir si des normales sont associ�es aux sommets du triangle
	 * 
	 * @return
	 */
	boolean hasVertexNormals();
	
	/** R�cup�ration de la normale au sommet d'indice index
	 * 
	 * @param index
	 * @return
	 */
	Vector3d getVertexNormal(int index) ;
	
	/** Permet de savoir si des coordonn�es de texture sont associ�es aux sommets du triangle
	 * 
	 * @return
	 */
	boolean hasTextureCoordinates() ;
	
	/** R�cup�ration des coordonn�es de textures associ�es au sommet d'indice index
	 * 
	 * @param index
	 * @return
	 */
	Vector2d getTextureCoordinate(int index) ;
}