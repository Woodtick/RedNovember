package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Stumble extends EventCard
{

	public Stumble( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription("The active player discards down to 1 item tile");
		this.setName("Stumble");
		this.setImage( ImageArchive.STUMBLE_EVENT);
		this.setIdentifier( EventCardIdentifier.STUMBLE);
	}
	
	public void evaluateConsequences()
	{
		//loose items
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
