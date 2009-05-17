package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class UnderwaterCurrent extends EventCard
{
	public UnderwaterCurrent(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Increase all low water tokens to high water" );
		this.setName( "Underwater Current" );
		this.setIdentifier( EventCardIdentifier.UNDERWATER_CURRENT );
	}

	@Override
	public void evaluateConsequences()
	{
		// raise water in all rooms with low water
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
