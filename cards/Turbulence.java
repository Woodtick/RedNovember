package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class Turbulence extends EventCard
{

	public Turbulence( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Hand limit is 4 for all players");
		this.setName( "Turbulence");
		this.setImage( ImageArchive.TURBULENCE_EVENT);
		this.setIdentifier( EventCardIdentifier.TURBULENCE);
	}
	
	public void evaluateConsequences()
	{
		//everyone looses items down to 4
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
