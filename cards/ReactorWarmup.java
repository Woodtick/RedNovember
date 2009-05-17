package cards;

import player.Player;
import utillities.EventCardIdentifier;
import utillities.ImageArchive;

public class ReactorWarmup extends EventCard
{

	public ReactorWarmup( int faintValue )
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Advance the heat track by +1");
		this.setName("Reactor Warmup");
		this.setIdentifier( EventCardIdentifier.REACTOR_WARMUP);
	}
	
	public void evaluateConsequences()
	{
		//move reactor track
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;
		
		return false;
	}
}
