package player;


import items.Item;

import java.util.Vector;

public class Rucksack
{
	private Vector<Item> Items = new Vector<Item>();
	
	public Rucksack()
	{
	}
	
	public Item unpackItem( Item itemToGet ) 
	{
		//Item gefunden
		if( Items.contains( itemToGet ) )
		{
			Items.remove( itemToGet );
			return itemToGet;
		}
			
		//Item nicht gefunden
		return null;
	}
	
	public Item unpackItem( int identifier ) 
	{
		for( Item i : this.Items )
		{
			if( i.getIdentifier() == identifier )
			{
				this.Items.remove( i );
				return i;
			}
				
		}
		return null;
	}
	
	public void packItem( Item itemToStore )
	{
		this.Items.add( itemToStore );
	}

	public boolean containsItem( int identifier )
	{
		for( Item i : this.Items )
		{
			if( i.getIdentifier() == identifier )
				return true;
		}
		return false;
	}

	
	public int getSize()
	{
		return this.Items.size();
	}
}
