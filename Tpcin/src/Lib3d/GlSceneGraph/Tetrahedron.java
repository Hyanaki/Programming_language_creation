package Lib3d.GlSceneGraph;

import com.jogamp.opengl.GLAutoDrawable;

public class Tetrahedron extends AbstractGeometry 
{
	public Tetrahedron()
	{
	}
	
	public void draw(GLAutoDrawable glDrawable)
	{
		super.draw(glDrawable) ;
		glut.glutSolidTetrahedron() ;
	}	
}
