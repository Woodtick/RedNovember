package items;

import utillities.ItemIdentifier;

public class Grog extends Item
{
	public Grog(int grantedBonus)
	{
		this.name = "Grog";
		this.description = "a fine strong bottle of grog";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.GROG;
	}
}
