package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import Lib3d.Vector3d;

public class Rotation extends Group implements Lib3d.SceneGraph.Rotation
{
	protected float m_angle ;
	protected Vector3d m_axis ;
	
	public Rotation(Vector3d axis, float angle)
	{
		m_angle = angle ;
		m_axis = axis ;
	}
	
	public float getAngle()
	{
		return m_angle ;
	}

	public Vector3d getAxis()
	{
		return m_axis ;
	}

	public void setAngle(float angle)
	{
		m_angle = angle ;
	}

	public void setAxis(Vector3d axis)
	{
		m_axis = axis ;
	}

	public void draw(GLAutoDrawable glDrawable)
	{
		final GL2 gl = glDrawable.getGL().getGL2() ;
		gl.glPushMatrix() ;
		gl.glRotatef(m_angle, m_axis.get(0), m_axis.get(1), m_axis.get(2));
		super.draw(glDrawable) ;
		gl.glPopMatrix() ;
	}

}
