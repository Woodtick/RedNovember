package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class FireSpreads extends EventCard
{
	public FireSpreads(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A fire starts in a room next to one on fire" );
		this.setName( "Fire spreads" );
		this.setIdentifier( EventCardIdentifier.FIRE_SPREADS );
	}

	@Override
	public void evaluateConsequences()
	{
		// spread fire over random (roll dice) room
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
