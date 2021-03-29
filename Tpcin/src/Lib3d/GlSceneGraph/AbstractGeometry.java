package Lib3d.GlSceneGraph;


import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.util.gl2.GLUT;

import Lib3d.Material;

public class AbstractGeometry implements Lib3d.SceneGraph.Geometry
{
	protected static GLUT glut = new GLUT() ;
	
	protected Material m_material = null ;
	
	public void setMaterial(Material material)
	{
		m_material = material ;
	}
	
	@Override
	public void draw(GLAutoDrawable glDrawable) {
		if(m_material!=null)
		{
			m_material.apply(glDrawable) ;
		}		
	}

}
