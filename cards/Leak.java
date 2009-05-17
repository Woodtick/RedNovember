package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class Leak extends EventCard
{

	public Leak(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A random room is flooded to high water" );
		this.setName( "Leak" );
		this.setIdentifier( EventCardIdentifier.LEAK );
	}

	@Override
	public void evaluateConsequences()
	{
		// flood a room (hight water token)
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
