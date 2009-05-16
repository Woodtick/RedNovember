package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Overheated extends EventCard
{

	public Overheated( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "All players must play a grog tile if possible. Increase intoxication.");
		this.setName("Overheated");
		this.setImage( ImageArchive.OVERHEATED_EVENT);
		this.setIdentifier( EventCardIdentifier.OVERHEATED);
	}
	
	public void evaluateConsequences()
	{
		//drink grog get intoxicated
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
