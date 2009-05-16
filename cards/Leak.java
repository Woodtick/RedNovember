package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Leak extends EventCard
{

	public Leak( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription("A random room is flooded to high water");
		this.setName( "Leak" );
		this.setImage( ImageArchive.LEAK_EVENT);
		this.setIdentifier( EventCardIdentifier.LEAK);
	}
		
	public void evaluateConsequences()
	{
		//flood a room (hight water token)
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}