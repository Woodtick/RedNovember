package items;

import utillities.ItemIdentifier;

public class WaterPump extends Item
{
	public WaterPump(int grantedBonus)
	{
		this.name = "Water Pump";
		this.description = "*pump* *pump*";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.WATER_PUMP;
	}
}
