package items;

import utillities.ItemIdentifier;

public class Coffee extends Item
{
	public Coffee(int grantedBonus)
	{
		this.name = "Coffee";
		this.description = "a gulp of coffee and you'll feel refreshed";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.COFFEE;
	}
}
