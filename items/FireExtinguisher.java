package items;

import utillities.ItemIdentifier;

public class FireExtinguisher extends Item
{
	public FireExtinguisher(int grantedBonus)
	{
		this.name = "Fire Extinguisher";
		this.description = "a plain fire extinguisher";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.FIRE_EXTINGUISHER;
	}
}
