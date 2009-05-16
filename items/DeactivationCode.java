package items;

import utillities.ItemIdentifier;

public class DeactivationCode extends Item
{
	public DeactivationCode(int grantedBonus)
	{
		this.name = "Deactivation Code";
		this.description = "0010110001100111";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.DEACTIVATION_CODE;
	}
}
