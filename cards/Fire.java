package cards;

import player.Player;
import server.GameManager;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Fire extends EventCard
{
	public Fire( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A fire starts in a random room");
		this.setName( "Fire" );
		this.setIdentifier( EventCardIdentifier.FIRE);
	}
	
	public void evaluateConsequences()
	{

	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( this.getFaintValue() == 0 )
			return false;
		else if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
