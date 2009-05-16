public class Menace
{
	private int time;

	private boolean activated;

	public Menace(int _time)
	{
		this.time = _time;
		this.activated = false;
	}

	public void advanceTime( int delta )
	{
		this.time -= delta;
	}

	public void deactivate()
	{
		this.activated = false;
	}

	public int getDueTime()
	{
		return this.time;
	}

	public boolean isActive()
	{
		return this.activated;
	}
}
