package submarine;

import java.util.List;


public class Room
{
	private boolean isOnFire;
	private int actionPointCosts;
	private List<Hatch> adjacentHatches;
	private boolean isUnderWater;
	
	public Room()
	{
		this.isOnFire = false;
		this.actionPointCosts = 0;
	}
	
	public List<Hatch> getAdjacentHatches()
	{
		return this.adjacentHatches;
	}

	public void addAdjacentHatch( Hatch hatch )
	{
		this.adjacentHatches.add( hatch );
	}

	public int getActionPointCosts()
	{
		return this.actionPointCosts;
	}

	public void setActionPointCosts( int actionPointCosts )
	{
		this.actionPointCosts = actionPointCosts;
	}

	public boolean isUnderWater()
	{
		return this.isUnderWater;
	}
	public void setUnderWater( boolean isUnderWater )
	{
		this.isUnderWater = isUnderWater;
		this.actionPointCosts = 1;
	}

	public boolean isOnFire()
	{
		return this.isOnFire;
	}

	public void setOnFire( boolean isOnFire )
	{
		//costs too high for the traversal algorithm to take it into account
		this.actionPointCosts = 1000;
		this.isOnFire = isOnFire;
	}

	public void blockHatchToRoom( Room room )
	{
	}

	public boolean isSeaLocation()
	{
		return false;
	}
}
