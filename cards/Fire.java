package cards;

import player.Player;
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
		//start random fire
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
