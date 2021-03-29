package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

public class Teapot extends AbstractGeometry 
{
	protected float m_size ;
	
	public Teapot(float size)
	{
		m_size = size ;
	}
	
	public void draw(GLAutoDrawable glDrawable)
	{
		super.draw(glDrawable) ;
		glut.glutSolidTeapot(m_size) ;
	}
}
