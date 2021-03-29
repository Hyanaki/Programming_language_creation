package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

public class Cube extends AbstractGeometry 
{
	protected float m_size ;
	
	public Cube(float size)
	{
		m_size = size ;
	}
	
	public void draw(GLAutoDrawable glDrawable)
	{
		super.draw(glDrawable) ;
		glut.glutSolidCube(m_size) ;
	}
}
