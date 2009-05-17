package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class HatchLocked extends EventCard
{

	public HatchLocked(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "The active player chooses a hatch to block attached to a random room" );
		this.setName( "Hatch blocked" );
		this.setIdentifier( EventCardIdentifier.HATCH_BLOCKED );
	}

	@Override
	public void evaluateConsequences()
	{
		// block hatch
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
