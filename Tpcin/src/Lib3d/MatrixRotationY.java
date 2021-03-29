package Lib3d;

public class MatrixRotationY extends Matrix4 
{
	public MatrixRotationY(float angle)
	{
		super() ;
		m_matrix[0][0] = (float)Math.cos(angle) ;
		m_matrix[0][2] = (float)Math.sin(angle) ;
		m_matrix[2][0] = -(float)Math.sin(angle) ;
		m_matrix[2][2] = (float)Math.cos(angle) ;
	}
}
