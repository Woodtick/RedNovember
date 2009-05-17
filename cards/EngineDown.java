package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class EngineDown extends EventCard
{

	public EngineDown(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Timed Event! Place the Crushed! Destruction Token at +10" );
		this.setName( "Engine Down" );
		this.setIdentifier( EventCardIdentifier.ENGINE_DOWN );
	}

	@Override
	public void evaluateConsequences()
	{
		// move engine token
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
