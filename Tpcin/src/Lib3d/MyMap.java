package Lib3d;

import java.util.ArrayList;
import java.util.Collection;

public class MyMap<Key,Value>
{
	private ArrayList<Key> m_keys = new ArrayList<Key>();
	private ArrayList<Value> m_values = new ArrayList<Value>();
	
	public boolean containsKey(Key key)
	{
		for(int cpt=0 ; cpt<m_keys.size(); ++cpt)
		{
			if(m_keys.contains(key))
			{
				return true ;
			}
		}
		return false ;
	}
	
	public Value get(Key key)
	{
		int index = m_keys.indexOf(key);
		return m_values.get(index);
	}
	
	public void put(Key key, Value value)
	{
		m_keys.add(key);
		m_values.add(value);
	}
	
	public Collection<Value> values()
	{
		return m_values ;
	}
}
