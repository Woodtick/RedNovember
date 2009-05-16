package items;

import utillities.ItemIdentifier;

public class ReactorManual extends Item
{
	public ReactorManual(int grantedBonus)
	{
		this.name = "Reactor Manual";
		this.description = "Explains the Reactor and how it works";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.REACTOR_MANUAL;
	}
}
