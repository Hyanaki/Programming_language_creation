package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import Lib3d.Vector3d;

public class Scale extends Group implements Lib3d.SceneGraph.Transform
{
	protected Vector3d m_scale;
	
	public Scale(Vector3d scale)
	{
		m_scale = scale ;
	}
	
	public Vector3d getScale()
	{
		return m_scale;
	}
	
	public void setScale(Vector3d scale)
	{
		m_scale = scale;
	}
	
	public void draw(GLAutoDrawable glDrawable)
	{
		final GL2 gl = glDrawable.getGL().getGL2() ;
		gl.glPushMatrix() ;
		gl.glScalef(m_scale.get(0), m_scale.get(1), m_scale.get(2));
		super.draw(glDrawable) ;
		gl.glPopMatrix() ;
	}

}
