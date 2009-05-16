package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class FriendlyFire extends EventCard
{

	public FriendlyFire( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A fire starts in a random room. A random room is flooded to high water. Hand limit is 4");
		this.setName( "Friendly Fire");
		this.setImage( ImageArchive.FRIENDLY_FIRE_EVENT);
		this.setIdentifier( EventCardIdentifier.FRIENDLY_FIRE);
	}
	
	public void evaluateConsequences()
	{
		//lots of things
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
