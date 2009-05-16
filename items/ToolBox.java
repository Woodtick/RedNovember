package items;

import utillities.ItemIdentifier;

public class ToolBox extends Item
{
	public ToolBox(int grantedBonus)
	{
		this.name = "Tool Box";
		this.description = "A handy all-in-one wonder box";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.TOOLBOX;
	}
}
