package cards;

import java.awt.Image;

import player.Player;

public abstract class EventCard
{
	private String name;
	private String description;
	private int faintValue;
	private int identifier;
	private Image image;
	
	public void setName( String name )
	{
		this.name = name;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public void setFaintValue( int faintValue )
	{
		this.faintValue = faintValue;
	}

	public void setIdentifier( int identifier )
	{
		this.identifier = identifier;
	}

	public void setImage( Image image )
	{
		this.image = image;
	}

	public String getName()
	{
		return this.name;
	}

	public String getDescription()
	{
		return this.description;
	}

	public int getFaintValue()
	{
		return this.faintValue;
	}

	public int getIdentifier()
	{
		return this.identifier;
	}

	public Image getImage()
	{
		return this.image;
	}

	//evaluate consequences followed by this card
	public abstract void evaluateConsequences();
	
	//Faint check, true if gnome passes out, else false
	public abstract boolean gnomeFaints( Player gnome );
}
