package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class FriendlyFire extends EventCard
{

	public FriendlyFire(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A fire starts in a random room. A random room is flooded to high water. Hand limit is 4" );
		this.setName( "Friendly Fire" );
		this.setIdentifier( EventCardIdentifier.FRIENDLY_FIRE );
	}

	@Override
	public void evaluateConsequences()
	{
		// lots of things
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
