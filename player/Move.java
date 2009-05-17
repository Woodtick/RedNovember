package player;

import submarine.Room;

public class Move
{

	private Room room;
	private int timeUsed;

	public void setRoom( Room from )
	{
		this.room = from;
	}

	public void setTimeUsed( int i )
	{
		this.timeUsed = i;
	}
	
	public void execute()
	{
		
	}

}
