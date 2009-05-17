package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class OxygenPumpsDown extends EventCard
{

	public OxygenPumpsDown(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Timed Event. Place the Asphyxiated! Destruction Token at +10" );
		this.setName( "Oxygen Pumps Down" );
		this.setIdentifier( EventCardIdentifier.OXYGEN_PUMPS_DOWN );
	}

	@Override
	public void evaluateConsequences()
	{
		// move pumps token
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
