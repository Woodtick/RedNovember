package items;

import utillities.ItemIdentifier;

public class DivingGun extends Item
{
	public DivingGun(int grantedBonus)
	{
		this.name = "Diving Gun";
		this.description = "get the Kraken!";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.DIVING_GUN;
	}
}
