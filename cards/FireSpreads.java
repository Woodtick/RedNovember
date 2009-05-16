package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class FireSpreads extends EventCard
{
	public FireSpreads( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A fire starts in a room next to one on fire");
		this.setName( "Fire spreads");
		this.setImage( ImageArchive.FIRE_SPREADS_EVENT );
		this.setIdentifier( EventCardIdentifier.FIRE_SPREADS);
	}
	
	public void evaluateConsequences()
	{
		//spread fire over random (roll dice) room
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
