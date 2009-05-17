package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class Respite extends EventCard
{
	public Respite(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Nothing happens" );
		this.setName( "Respite" );
		this.setIdentifier( EventCardIdentifier.RESPITE );
	}

	@Override
	public void evaluateConsequences()
	{
		// nothing happens
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
