package Lib3d.GlSceneGraph;

import java.util.Iterator;
import java.util.ArrayList;
import com.jogamp.opengl.GLAutoDrawable;

import Lib3d.SceneGraph.Node;

/** Implémentation de la classe Group sous openGL
 * 
 * @author flamarch
 *
 */
public class Group implements Lib3d.SceneGraph.Group
{
	protected ArrayList<Node> m_nodes = new ArrayList<Node>() ;
	
	public void addChild(Node child)
	{
		m_nodes.add(child) ;
	}

	public Iterator<Node> childIterator()
	{
		return m_nodes.iterator();
	}

	public void draw(GLAutoDrawable gLDrawable)
	{
		for(Node node : m_nodes) 
		{
			node.draw(gLDrawable);
		}
	}
}
