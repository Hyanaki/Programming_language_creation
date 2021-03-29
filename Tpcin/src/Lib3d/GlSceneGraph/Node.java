package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

/** Implémentation de la classe Node sous OpenGL
 * 
 * @author flamarch
 *
 */
public abstract class Node implements Lib3d.SceneGraph.Node
{
	public abstract void draw(GLAutoDrawable gLDrawable) ;
}
