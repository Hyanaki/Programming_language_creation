package Lib3d;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;


/** Classe contenant des procédures d'affichage des objets 3D
 * 
 * @author flamarch
 *
 */
public class Draw
{

	private static void draw(GLAutoDrawable gLDrawable, Triangle3d triangle, Material material)
	{
		final GL2 gl = gLDrawable.getGL().getGL2();

		for(int cpt=0 ; cpt<3 ; ++cpt)
		{
			if(triangle.hasTextureCoordinates())
			{
				gl.glTexCoord2fv(Vector2d.mul(triangle.getTextureCoordinate(cpt), material.getTextureScale()).toBuffer()) ;
			}
			if(triangle.hasVertexNormals())
			{
				gl.glNormal3fv(triangle.getVertexNormal(cpt).toBuffer()) ;
			}
			gl.glVertex3fv(triangle.getVertex(cpt).toBuffer()) ;
		}
	}

	private static void setMaterial(GLAutoDrawable gLDrawable, Material material)
	{
		final GL2 gl = gLDrawable.getGL().getGL2();
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_AMBIENT, material.getKa().toBuffer()) ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_DIFFUSE, material.getKd().toBuffer()) ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_SPECULAR, material.getKs().toBuffer()) ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_EMISSION, material.getEmissive().toBuffer()) ;
		float[] shininess = { (float)material.getNs()} ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_SHININESS, shininess, 0) ;
	}

	/** Affichage d'un objet 3D
	 * 
	 * @param gLDrawable Le contexte de rendu OpenGL
	 * @param object L'objet à afficher
	 * @param matLib La librairie de matériaux à utiliser pour l'objet
	 */
	public static void draw(GLAutoDrawable gLDrawable, Object3d object, MaterialLib matLib)
	{
		final GL2 gl = gLDrawable.getGL().getGL2();

		Material material = matLib.getMaterial(object.getMaterial()) ;
		gl.glBindTexture(GL.GL_TEXTURE_2D, material.getTextureId()) ;

		gl.glBegin(GL.GL_TRIANGLES) ;
		setMaterial(gLDrawable, material) ;

		for(int cpt=0 ; cpt<object.getTriangles().size() ; ++cpt)
		{
			draw(gLDrawable, object.getTriangle(cpt), material) ;
		}

		gl.glEnd();
	}

	/** Permet d'afficher un repère à la position courante. En rouge l'axe X, en vert l'axe Y, en bleu l'axe Z
	 * 
	 * @param gLDrawable Le contexte d'affichage OpenGL
	 * @param scale La longueur des segments représentant chacun des axes
	 */
	public static void drawAxis(GLAutoDrawable gLDrawable, float scale)
	{
		final GL2 gl = gLDrawable.getGL().getGL2();

	    gl.glEnable(GL2.GL_COLOR_MATERIAL) ;
	    
		gl.glBegin(GL.GL_LINES) ;
		// Axe X
		gl.glColor3f(1.0f, 0.0f, 0.0f) ;
		gl.glVertex3f(0.0f, 0.0f, 0.0f) ;
		gl.glColor3f(1.0f, 0.0f, 0.0f) ;
		gl.glVertex3f(scale, 0.0f, 0.0f) ;
		// Axe Y
		gl.glColor3f(0.0f, 1.0f, 0.0f) ;
		gl.glVertex3f(0.0f, 0.0f, 0.0f) ;
		gl.glColor3f(0.0f, 1.0f, 0.0f) ;
		gl.glVertex3f(0.0f, scale, 0.0f) ;
		// Axe Z
		gl.glColor3f(0.0f, 0.0f, 1.0f) ;
		gl.glVertex3f(0.0f, 0.0f, 0.0f) ;
		gl.glColor3f(0.0f, 0.0f, 1.0f) ;
		gl.glVertex3f(0.0f, 0.0f, scale) ;

		gl.glEnd();
		
		gl.glDisable(GL2.GL_COLOR_MATERIAL) ;
	}

}
