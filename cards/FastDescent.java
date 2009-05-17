package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class FastDescent extends EventCard
{
	public FastDescent(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Advance the pressure track by 2" );
		this.setName( "Fast Descent" );
		this.setIdentifier( EventCardIdentifier.FAST_DESCENT );
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
