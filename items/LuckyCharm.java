package items;

import utillities.ItemIdentifier;

public class LuckyCharm extends Item
{
	public LuckyCharm()
	{
		this.name = "Lucky Charm";
		this.description = "a little rubber duck";
		this.grantedBonus = 0;
		this.identifier = ItemIdentifier.LUCKY_CHARM;
	}
}
