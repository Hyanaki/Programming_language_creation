package Lib3d;

public class Matrix4 
{
	protected float[][] m_matrix ;
	
	/** 
	 * @brief Creates an identity matrix
	 */
	public Matrix4()
	{
		m_matrix = new float[4][4] ;
		for(int line=0 ; line<4 ; ++line)
		{
			for(int column=0 ; column<4 ; ++column)
			{
				if(line==column)
				{
					m_matrix[line][column] = 1.0f ;
				}
				else
				{
					m_matrix[line][column] = 0.0f ;
				}
			}
		}
	}
	
	/**
	 * @brief Multiplies current matrix by matrix m and returns the resulting matrix. The current matrix is not modified.
	 * @param m 
	 */
	public Matrix4 mult(Matrix4 m)
	{
		Matrix4 result = new Matrix4() ;
		for(int line=0 ; line<4 ; ++line)
		{
			for(int column=0 ; column<4 ; ++column)
			{
				for(int count = 0 ; count<4 ; ++count)
				{
					result.m_matrix[line][column] += m_matrix[line][count]*m.m_matrix[count][column] ;
				}
			}
		}
		return result ;
	}
	
	/**
	 * Applies the current transformation to v
	 * @param v The vector
	 * @return The transformed vector
	 */
	public Vector3d transform(Vector3d v)
	{
		float[] result = new float[4] ;
		//Vector3d result = new Vector3d(0.0f, 0.0f, 0.0f) ;
		for(int line=0 ; line<4 ; ++line)
		{
			result[line] = 0.0f ;
			for(int column=0 ; column<4 ; ++column)
			{
				float value ;
				if(column==3) { value=1 ; }
				else { value = v.get(column) ; }
				result[line] += m_matrix[line][column]*value ;
			}
		}
		return new Vector3d(result[0]/result[3], result[1]/result[3], result[2]/result[3]) ;
	}
}
