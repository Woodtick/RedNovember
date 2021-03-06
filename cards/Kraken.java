package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class Kraken extends EventCard
{

	public Kraken(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Timed Event. Place the Kraken! Destruction Token at +15. Hand limit 4" );
		this.setName( "Kraken" );
		this.setIdentifier( EventCardIdentifier.KRAKEN );
	}

	@Override
	public void evaluateConsequences()
	{
		// destructioon token gets moved
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
