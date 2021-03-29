package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

import Lib3d.Draw;
import Lib3d.MaterialLib;
import Lib3d.Object3d;

/** Implémentation d'une classe de rendu de géométrie avec matériau sous OpenGL
 *  
 * @author flamarch
 *
 */
public class Geometry implements Lib3d.SceneGraph.Geometry
{
	protected Object3d m_object ;
	protected MaterialLib m_materialLib ;
	
	public Geometry(Object3d object, MaterialLib materialLib)
	{
		m_object = object ;
		m_materialLib = materialLib ;
	}
	
	public void draw(GLAutoDrawable gLDrawable)
	{
		Draw.draw(gLDrawable, m_object, m_materialLib) ;
	}
}
