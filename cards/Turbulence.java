package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class Turbulence extends EventCard
{

	public Turbulence(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Hand limit is 4 for all players" );
		this.setName( "Turbulence" );
		this.setIdentifier( EventCardIdentifier.TURBULENCE );
	}

	@Override
	public void evaluateConsequences()
	{
		// everyone looses items down to 4
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
