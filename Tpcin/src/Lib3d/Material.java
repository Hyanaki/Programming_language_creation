package Lib3d;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

/** Description d'un matériau
 * 
 * @author flamarch
 *
 */
public class Material 
{
	protected Color m_Ka = new Color(0.0f, 0.0f, 0.0f) ; 
	protected Color m_Kd = new Color(0.0f, 0.0f, 0.0f) ;
	protected Color m_Ks = new Color(0.0f, 0.0f, 0.0f) ;
	protected Color m_emissiveColor = new Color(0.0f, 0.0f, 0.0f) ;
	protected float m_d = 1.0f ;
	protected float m_Ns = 1.0f ; 
	protected Vector2d m_textureScale = new Vector2d(1.0f, 1.0f) ;
	protected String m_textureFile = null ;
	protected String m_identifier = null ;
	protected int m_textureId = -1 ;
	
	public Material(String identifier)
	{
		m_identifier = identifier ;
	}
	
	public Material(String identifier, Color Ka, Color Kd, Color Ks, float d, float Ns, Vector2d textureScale, String textureFile)
	{
		m_Ka = Ka ;
		m_Kd = Kd ;
		m_Ks = Ks ;
		m_d = d ;
		m_Ns = Ns ;
		m_textureScale = textureScale ;
		m_textureFile = textureFile ;
		m_identifier = identifier ;
	}
	

	public Color getKa()
	{ return m_Ka ; }
	
	public Color getKd()
	{ return m_Kd ; }
	
	public Color getKs()
	{ return m_Ks ; }
	
	public Color getEmissive()
	{
		return m_emissiveColor ;
	}
	
	public Vector2d getTextureScale()
	{
		return m_textureScale ;
	}
	
	public float getNs()
	{ return m_Ns ; }
	
	public boolean hasTexture()
	{
		return m_textureFile != null ;
	}
	
	public String getTextureFile()
	{ return m_textureFile ; }
	
	public String getIdentifier()
	{ return m_identifier ; }
	
	public int getTextureId()
	{
		assert(m_textureId != -1) ;
		return m_textureId ; 
	}
	
	public void setTextureId(int id)
	{
		m_textureId = id ;
	}
	
	public void apply(GLAutoDrawable gLDrawable)
	{
		final GL2 gl = gLDrawable.getGL().getGL2();
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_AMBIENT, this.getKa().toBuffer()) ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_DIFFUSE, this.getKd().toBuffer()) ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_SPECULAR, this.getKs().toBuffer()) ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_EMISSION, this.getEmissive().toBuffer()) ;
		float[] shininess = { (float)this.getNs()} ;
		gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_SHININESS, shininess, 0) ;		
		if(getTextureId()!=-1)
		{
			gl.glBindTexture(GL.GL_TEXTURE_2D, this.getTextureId()) ;
		}
	}
}
