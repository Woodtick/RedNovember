package items;

import utillities.ItemIdentifier;

public class Aqualung extends Item
{
	public Aqualung()
	{
		this.name = "Aqualung";
		this.description = "The crown of gnomish sea equipment technology, the aqualung!";
		this.grantedBonus = 0;
		this.identifier = ItemIdentifier.AQUALUNG;
	}
}
