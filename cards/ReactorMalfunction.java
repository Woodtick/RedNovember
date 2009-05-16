package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class ReactorMalfunction extends EventCard
{

	public ReactorMalfunction(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Advance the heat track by +2");
		this.setName("Reactor Malfunction");
		this.setImage( ImageArchive.REACTOR_MALFUNCTION_EVENT);
		this.setIdentifier( EventCardIdentifier.REACTOR_MALFUNCTION);
	}

	@Override
	public void evaluateConsequences()
	{
		// move reactor track
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
