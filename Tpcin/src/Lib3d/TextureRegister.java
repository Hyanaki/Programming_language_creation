package Lib3d;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.gl2.GLUgl2;

/** Classe permettant de déclarer une nouvelle texture pour OpenGL
 * 
 * @author flamarch
 *
 */
public class TextureRegister
{
	//private static final GLU glu = new GLU();
	private static final GLUgl2 glu = new GLUgl2();
	
	public static int register(GL gl, Texture texture)
	{
		int id = genTexture(gl) ;
		makeTexture(gl, texture, id) ;
		return id ;
	}

	private static void makeTexture(GL gl, Texture img, int id)
	{
		gl.glBindTexture(GL.GL_TEXTURE_2D, id) ;
		glu.gluBuild2DMipmaps(GL.GL_TEXTURE_2D, GL.GL_RGB8, img.getWidth(), img.getHeight(), GL.GL_RGB, GL.GL_UNSIGNED_BYTE, img.getPixels());
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
//	    gl.glTexImage2D(GL.GL_TEXTURE_2D, 0, GL.GL_RGB, img.getWidth(), img.getHeight(), 0, GL.GL_RGB, GL.GL_UNSIGNED_BYTE, img.getPixels());
//		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
//		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
	}

	private static int genTexture(GL gl)
	{
		final int[] tmp = new int[1];
		gl.glGenTextures(1, tmp, 0);
		return tmp[0];
	}
}
