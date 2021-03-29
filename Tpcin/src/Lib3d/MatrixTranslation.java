package Lib3d;

public class MatrixTranslation extends Matrix4 
{
	/**
	 * Creates a translation matrix
	 * @param translation The translation vector
	 */
	public MatrixTranslation(Vector3d translation)
	{
		super() ;
		for(int line=0 ; line<3 ; ++line)
		{
			m_matrix[line][3] = translation.get(line) ;
		}
		m_matrix[3][3] = 1.0f ;
	}
}
