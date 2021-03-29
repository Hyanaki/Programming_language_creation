package Lib3d.SceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

/** Interface représentant un noeud du graphe de Scene
 * 
 * @author flamarch
 *
 */
public interface Node
{
	/** Effectue tous les traitements relatifs à l'affichage OpenGL liés à un Noeud du graphe de scène
	 * 
	 * @param glDrawable Context d'affichage OpenGL
	 */
	void draw(GLAutoDrawable gLDrawable) ;
}
