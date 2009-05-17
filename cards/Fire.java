package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class Fire extends EventCard
{
	public Fire(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A fire starts in a random room" );
		this.setName( "Fire" );
		this.setIdentifier( EventCardIdentifier.FIRE );
	}

	@Override
	public void evaluateConsequences()
	{

	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( this.getFaintValue() == 0 )
			return false;
		else if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
