package items;

public abstract class Item
{
	// Name of the Item
	String name;

	// Description of the item
	String description;

	// Value of the bonus this item grants
	int grantedBonus;

	// Item identifier value
	int identifier;

	public String getDescription()
	{
		return this.description;
	}

	public int getIdentifier()
	{
		return this.identifier;
	}

	public String getName()
	{
		return this.name;
	}

	public int getGrantedBonus()
	{
		return this.grantedBonus;
	}
}
