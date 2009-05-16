package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Respite extends EventCard
{
	public Respite( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Nothing happens" );
		this.setName( "Respite");
		this.setImage( ImageArchive.RESPITE_COUNTDOWN_EVENT);
		this.setIdentifier( EventCardIdentifier.RESPITE);
	}
	
	public void evaluateConsequences()
	{
		//nothing happens
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
