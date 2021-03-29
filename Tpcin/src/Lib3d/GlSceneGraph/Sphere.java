package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import Lib3d.Material;

/** Noeud de géométrie reprrésentant une sphère
 * 
 * @author Administrateur
 *
 */
public class Sphere extends AbstractGeometry 
{
	private GLU m_glu = new GLU() ;

	protected float m_radius ;
	protected int	m_slices ;
	protected int   m_stacks ;
	protected Material m_material = null ;
	
	public Sphere(float radius, int slices, int stacks)
	{
		m_radius = radius ;
		m_slices = slices ;
		m_stacks = stacks ;
	}
	
	public void setMaterial(Material material)
	{
		m_material = material ;
	}
	
	//@Override
	public void draw(GLAutoDrawable gLDrawable) 
	{
		if(m_material!=null)
		{
			m_material.apply(gLDrawable) ;
		}
		GLUquadric sphere = m_glu.gluNewQuadric() ;
		m_glu.gluSphere(sphere, m_radius, m_slices, m_stacks) ;
	}
}
