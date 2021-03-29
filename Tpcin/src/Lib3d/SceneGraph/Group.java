package Lib3d.SceneGraph;

import java.util.Iterator ;

public interface Group extends Node
{
	/** Ajoute un noeud fils au groupe
	 * 
	 * @param child Le fils � ajouter
	 */
	void addChild(Node child) ;
	
	/** R�cup�ration d'un it�rateur sur les noeuds fils du groupe
	 * 
	 * @return Un it�rateur sur les fils du groupe
	 */
	Iterator<Node> childIterator() ;
}
