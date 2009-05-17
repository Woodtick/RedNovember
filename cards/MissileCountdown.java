package cards;

import player.Player;
import utillities.EventCardIdentifier;

public class MissileCountdown extends EventCard
{

	public MissileCountdown(int faintValue)
	{
		this.setFaintValue( faintValue );
		this.setDescription( "Timed Event. Place the Missile Countdown! Destruction Token at +10" );
		this.setName( "Missile Countdown" );
		this.setIdentifier( EventCardIdentifier.MISSILE_COUNTDOWN );
	}

	@Override
	public void evaluateConsequences()
	{
		// move destruction token
	}

	@Override
	public boolean gnomeFaints( Player gnome )
	{
		if ( gnome.getIntoxicationLevel() >= this.getFaintValue() )
			return true;

		return false;
	}
}
