package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

public class Torus extends AbstractGeometry 
{
	protected float m_innerRadius ;
	protected float m_outerRadius ;
	protected int m_sides ;
	protected int m_rings ;
	
	public Torus(float innerRadius, float outerRadius, int sides, int rings)
	{
		m_innerRadius = innerRadius ;
		m_outerRadius = outerRadius ;
		m_sides = sides ;
		m_rings = rings ;
	}
	
	public void draw(GLAutoDrawable glDrawable)
	{
		super.draw(glDrawable) ;
		glut.glutSolidTorus(m_innerRadius, m_outerRadius, m_sides, m_rings) ;
	}	
}
