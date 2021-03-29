package Lib3d.SceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

/** Interface repr�sentant un noeud du graphe de Scene
 * 
 * @author flamarch
 *
 */
public interface Node
{
	/** Effectue tous les traitements relatifs � l'affichage OpenGL li�s � un Noeud du graphe de sc�ne
	 * 
	 * @param glDrawable Context d'affichage OpenGL
	 */
	void draw(GLAutoDrawable gLDrawable) ;
}
