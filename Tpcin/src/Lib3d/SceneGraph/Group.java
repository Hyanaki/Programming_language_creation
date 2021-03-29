package Lib3d.SceneGraph;

import java.util.Iterator ;

public interface Group extends Node
{
	/** Ajoute un noeud fils au groupe
	 * 
	 * @param child Le fils à ajouter
	 */
	void addChild(Node child) ;
	
	/** Récupération d'un itérateur sur les noeuds fils du groupe
	 * 
	 * @return Un itérateur sur les fils du groupe
	 */
	Iterator<Node> childIterator() ;
}
