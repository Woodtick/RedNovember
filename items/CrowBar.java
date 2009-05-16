package items;

import utillities.ItemIdentifier;

public class CrowBar extends Item
{
	public CrowBar(int grantedBonus)
	{
		this.name = "Crow Bar";
		this.description = "a nice little malicious crow bar";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.CROWBAR;
	}
}
