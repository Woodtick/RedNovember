import java.util.Vector;

import actions.ExtinguishFireAction;
import actions.FixMachineAction;
import actions.KillKrakenAction;
import actions.PlayerAction;
import actions.PumpWaterAction;
import actions.TakeGrogAction;
import actions.TakeItemAction;

public abstract class Room
{
	protected boolean isOnFire;

	protected boolean isOnHalfWater;

	protected boolean isOnFullWater;

	protected boolean isOutside;

	protected boolean hasMachine;

	protected boolean hasGrog;

	protected boolean hasItems;

	protected boolean hasMissileMenace;

	protected boolean hasOxygenMenace;

	protected boolean hasEngineMenace;

	protected boolean hasKrakenMenace;

	public Room()
	{
		this.isOnFire = false;
		this.isOnHalfWater = false;
		this.isOnFullWater = false;
		this.hasGrog = false;
		this.hasItems = false;
		this.isOutside = false;
		this.hasMachine = false;

		this.hasKrakenMenace = false;
		this.hasMissileMenace = false;
		this.hasOxygenMenace = false;
		this.hasEngineMenace = false;
	}

	public Vector<PlayerAction> getAllowedActions()
	{
		Vector<PlayerAction> allowedActions = new Vector<PlayerAction>();

		if ( this.isOnFire() )
		{
			allowedActions.addElement( new ExtinguishFireAction() );
			return allowedActions;
		}

		if ( this.isOnWater() )
		{
			allowedActions.addElement( new PumpWaterAction() );
		}

		if ( this.hasMachine() )
		{
			allowedActions.addElement( new FixMachineAction() );
		}

		if ( this.isOutside() )
		{
			allowedActions.addElement( new KillKrakenAction() );
		}

		if ( this.hasGrog() )
		{
			allowedActions.addElement( new TakeGrogAction() );
		}

		if ( this.hasItems() )
		{
			allowedActions.addElement( new TakeItemAction() );
		}

		return allowedActions;
	}

	public boolean hasEngineMenace()
	{
		return this.hasEngineMenace;
	}

	public boolean hasGrog()
	{
		return this.hasGrog;
	}

	public boolean hasItems()
	{
		return this.hasItems;
	}

	public boolean hasKrakenMenace()
	{
		return this.hasKrakenMenace;
	}

	public boolean hasMachine()
	{
		return this.hasMachine;
	}

	public boolean hasMissileMenace()
	{
		return this.hasMissileMenace;
	}

	public boolean hasOxygenMenace()
	{
		return this.hasOxygenMenace;
	}

	public boolean isOnFire()
	{
		return this.isOnFire;
	}

	public boolean isOnFullWater()
	{
		return this.isOnFullWater;
	}

	public boolean isOnHalfWater()
	{
		return this.isOnHalfWater;
	}

	public boolean isOnWater()
	{
		return ( this.isOnHalfWater || this.isOnFullWater );
	}

	public boolean isOutside()
	{
		return this.isOutside;
	}
}
