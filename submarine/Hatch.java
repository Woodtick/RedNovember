package submarine;


public class Hatch
{
	private boolean isBlocked;
	private int actionPointCosts;
	private Room firstRoom, secondRoom;
	
	public Room getNeighbouringRoom( Room room )
	{
		if( !this.firstRoom.equals( room ) )
			return this.firstRoom;
		else
			return this.secondRoom;
	}
	
	public Room getFirstRoom()
	{
		return this.firstRoom;
	}

	public void setFirstRoom( Room firstRoom )
	{
		this.firstRoom = firstRoom;
	}

	public Room getSecondRoom()
	{
		return this.secondRoom;
	}

	public void setSecondRoom( Room secondRoom )
	{
		this.secondRoom = secondRoom;
	}

	public int getActionPointCosts()
	{
		return this.actionPointCosts;
	}

	public Hatch()
	{
		this.actionPointCosts = 1;
		this.isBlocked = false;
	}

	public int getActionPointsCosts()
	{
		return this.actionPointCosts;
	}

	public void setActionPointsCosts( int actionPointsCosts )
	{
		this.actionPointCosts = actionPointsCosts;
	}

	public boolean isBlocked()
	{
		return this.isBlocked;
	}

	public void setBlocked( boolean isBlocked )
	{
		this.isBlocked = isBlocked;
	}
}
