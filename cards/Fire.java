package cards;

import player.Player;
import server.GameManager;
import utillities.Dice;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Fire extends EventCard
{
	public Fire( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "A fire starts in a random room");
		this.setName( "Fire" );
		this.setImage( ImageArchive.FIRE_EVENT );
		this.setIdentifier( EventCardIdentifier.FIRE);
	}
	
	public void evaluateConsequences()
	{
		GameManager.evaluateEvent();
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
