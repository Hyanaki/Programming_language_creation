package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import Lib3d.Vector3d;

public class Translation extends Group implements Lib3d.SceneGraph.Translation
{
	protected Vector3d m_translation ;

	public Translation(Vector3d translation)
	{
		m_translation = translation ;
	}
	
	public Vector3d getTranslation()
	{
		return m_translation ;
	}

	public void setTranslation(Vector3d translation)
	{
		m_translation = translation ;
	}

	public void draw(GLAutoDrawable glDrawable)
	{
		final GL2 gl = glDrawable.getGL().getGL2() ;
		gl.glPushMatrix() ;
		gl.glTranslatef(m_translation.get(0), m_translation.get(1), m_translation.get(2));
		super.draw(glDrawable) ;
		gl.glPopMatrix() ;
	}
}
