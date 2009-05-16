package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Descent extends EventCard
{

	public Descent( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Advance the pressure track by 1");
		this.setName( "Descent");
		this.setImage( ImageArchive.DESCENT_EVENT );
		this.setIdentifier( EventCardIdentifier.DESCENT);
	}
	
	public void evaluateConsequences()
	{
		//advance pressure track
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
