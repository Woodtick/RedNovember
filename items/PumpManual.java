package items;

import utillities.ItemIdentifier;

public class PumpManual extends Item
{
	public PumpManual(int grantedBonus)
	{
		this.name = "Pump Manual";
		this.description = "pumps, pumps and even more pumps.";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.PUMP_MANUAL;
	}
}
