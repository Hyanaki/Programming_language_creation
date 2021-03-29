package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

public class Cone extends AbstractGeometry 
{
	protected float m_base ;
	protected float m_height ;
	protected int m_slices ;
	protected int m_stacks ;

	public Cone(float base, float height, int slices, int stacks)
	{
		m_base = base ;
		m_height = height ;
		m_slices = slices ;
		m_stacks = stacks ;
	}
	
	public void draw(GLAutoDrawable glDrawable)
	{
		super.draw(glDrawable) ;
		glut.glutSolidCone(m_base, m_height, m_slices, m_stacks) ;
	}	
}
