package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class Descent extends EventCard
{

	public Descent(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Advance the pressure track by 1" );
		this.setName( "Descent" );
		this.setIdentifier( EventCardIdentifier.DESCENT );
	}

	@Override
	public void evaluateConsequences()
	{
		// advance pressure track
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
