package player;

import submarine.Hatch;

public class NullMove extends Move
{
	
	private Hatch hatch;

	public NullMove( Hatch hatch )
	{
		this.hatch = hatch;
	}
	
	public void execute()
	{
		
	}
}
