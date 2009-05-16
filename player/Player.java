package player;


import items.Item;
import submarine.Room;
import utillities.ItemIdentifier;

public class Player
{
	protected Room currentRoom;
	private String gnomeName;
	protected Rucksack rucksack;
	protected int time;
	private int intoxicationLevel;
	private boolean immuneToFire;

	public Player()
	{
		super();
	}

	public void drinkGrog( Item grog )
	{
		int identifier = grog.getIdentifier();
		if ( this.rucksack.containsItem( identifier ) && identifier == ItemIdentifier.GROG )
		{
			this.rucksack.unpackItem( grog );
			this.intoxicationLevel++;
			this.immuneToFire = true;
		}
	}

	public void fixMachine( TimeKeeper usedTime )
	{
	
	}

	public void fixMachine( TimeKeeper usedTime, Item usedItem )
	{
	
	}

	public String getGnomeName()
	{
		return this.gnomeName;
	}

	public int getIntoxicationLevel()
	{
		return this.intoxicationLevel;
	}

	public Rucksack getRucksack()
	{
		return this.rucksack;
	}

	public int getTime()
	{
		return this.time;
	}
	
	public boolean isImmuneToFire()
	{
		return this.immuneToFire;
	}

	public void setImmuneToFire( boolean immuneToFire )
	{
		this.immuneToFire = immuneToFire;
	}

	public void setIntoxicationLevel( int intoxicationStage )
	{
		this.intoxicationLevel = intoxicationStage;
	}

	public void setRucksack( Rucksack rucksack )
	{
		this.rucksack = rucksack;
	}

	public void setTime( int time )
	{
		this.time = time;
	}

	public boolean useItem( Item usedItem )
	{
		return true;
	}

}