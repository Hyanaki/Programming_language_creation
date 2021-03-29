package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import Lib3d.Material;

public class Cylinder extends AbstractGeometry  
{
	private GLU m_glu = new GLU() ;

	protected float m_base ;
	protected float m_top ;
	protected float m_height ;
	protected int	m_slices ;
	protected int   m_stacks ;
	protected Material m_material = null ;

	public Cylinder(float base, float top, float height, int slices, int stacks)
	{
		m_base = base ;
		m_top = top ;
		m_height = height ;
		m_slices = slices ;
		m_stacks = stacks ;
	}


	public void draw(GLAutoDrawable glDrawable) 
	{
		super.draw(glDrawable) ;
		GLUquadric cylinder = m_glu.gluNewQuadric() ;
		m_glu.gluCylinder(cylinder, m_base, m_top, m_height, m_slices, m_stacks) ;
	}
}
