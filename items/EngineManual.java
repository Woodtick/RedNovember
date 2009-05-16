package items;

import utillities.ItemIdentifier;

public abstract class EngineManual extends Item
{
	public EngineManual(int grantedBonus)
	{
		this.name = "Engine Manual";
		this.description = "A profound manual, covering the whole world of machines and engines";
		this.grantedBonus = grantedBonus;
		this.identifier = ItemIdentifier.ENGINE_MANUAL;
	}
}
