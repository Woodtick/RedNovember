package submarine;

public class Submarine
{
	private EngineRoom engineRoom;
	private OxygenPumps oxygenPumps;
	private ReactorRoom reactorRoom;
	private MissileControl missileControl;

	private Sea sea;

	private CaptainsCabin captainsCabin;

	private EquipmentStore equipmentStore;

	// Lower left of submarine
	private Room room1;

	// Middle of submarine
	private Room room2;

	// Top Exit room
	private Room room3;

	// Lower right of submarine
	private Room room4;

	private Hatch No1;

	private Hatch No2;

	private Hatch No3;

	private Hatch No4;

	private Hatch No5;
	private Hatch No6;
	private Hatch No7;

	private Hatch No8;
	private Hatch No9;
	private Hatch No10;
	private Hatch No11;

	private Hatch No12;
	private Hatch No13;
	private Hatch No14;
	private Hatch No15;
	private Hatch No16;
	private Hatch No17;
	private Hatch No18;

	public Submarine()
	{
		this.initializeRooms();
	}

	public CaptainsCabin getCaptainsCabin()
	{
		return this.captainsCabin;
	}

	public EngineRoom getEngineRoom()
	{
		return this.engineRoom;
	}

	public EquipmentStore getEquipmentStore()
	{
		return this.equipmentStore;
	}

	public MissileControl getMissileControl()
	{
		return this.missileControl;
	}

	public OxygenPumps getOxygenPumps()
	{
		return this.oxygenPumps;
	}

	public ReactorRoom getReactorRoom()
	{
		return this.reactorRoom;
	}

	public Room getRoom1()
	{
		return this.room1;
	}

	public Room getRoom2()
	{
		return this.room2;
	}

	public Room getRoom3()
	{
		return this.room3;
	}

	public Room getRoom4()
	{
		return this.room4;
	}

	public Room getRoomByNumber( int i )
	{
		if ( i == 1 )
			return this.engineRoom;
		else if ( i == 2 )
			return this.oxygenPumps;
		else if ( i == 3 )
			return this.room1;
		else if ( i == 4 )
			return this.reactorRoom;
		else if ( i == 5 )
			return this.room2;
		else if ( i == 6 )
			return this.room3;
		else if ( i == 7 )
			return this.missileControl;
		else if ( i == 8 )
			return this.equipmentStore;
		else if ( i == 9 )
			return this.room4;

		return this.captainsCabin;
	}

	public Sea getSea()
	{
		return this.sea;
	}

	private void initializeRooms()
	{
		// building from left to right, top to bottom
		this.engineRoom = new EngineRoom();
		this.oxygenPumps = new OxygenPumps();
		this.reactorRoom = new ReactorRoom();
		this.missileControl = new MissileControl();
		this.equipmentStore = new EquipmentStore();
		this.captainsCabin = new CaptainsCabin();
		this.sea = new Sea();

		this.room1 = new Room();
		this.room2 = new Room();
		this.room3 = new Room();
		this.room4 = new Room();

		this.No1 = new Hatch();
		this.No2 = new Hatch();
		this.No3 = new Hatch();
		this.No4 = new Hatch();
		this.No5 = new Hatch();
		this.No6 = new Hatch();
		this.No7 = new Hatch();
		this.No8 = new Hatch();
		this.No9 = new Hatch();
		this.No10 = new Hatch();
		this.No11 = new Hatch();
		this.No12 = new Hatch();
		this.No13 = new Hatch();
		this.No14 = new Hatch();
		this.No15 = new Hatch();
		this.No16 = new Hatch();
		this.No17 = new Hatch();
		this.No18 = new Hatch();

		this.No1.setFirstRoom( this.engineRoom );
		this.No1.setSecondRoom( this.oxygenPumps );

		this.No2.setFirstRoom( this.room1 );
		this.No2.setSecondRoom( this.engineRoom );

		this.No3.setFirstRoom( this.oxygenPumps );
		this.No3.setSecondRoom( this.room1 );

		this.No4.setFirstRoom( this.oxygenPumps );
		this.No4.setSecondRoom( this.room2 );

		this.No5.setFirstRoom( this.oxygenPumps );
		this.No5.setSecondRoom( this.reactorRoom );

		this.No6.setFirstRoom( this.reactorRoom );
		this.No6.setSecondRoom( this.room1 );

		this.No7.setFirstRoom( this.sea );
		this.No7.setSecondRoom( this.room1 );

		this.No8.setFirstRoom( this.reactorRoom );
		this.No8.setSecondRoom( this.room2 );

		this.No9.setFirstRoom( this.room2 );
		this.No9.setSecondRoom( this.room3 );

		this.No10.setFirstRoom( this.sea );
		this.No10.setSecondRoom( this.room3 );

		this.No11.setFirstRoom( this.missileControl );
		this.No11.setSecondRoom( this.room2 );

		this.No12.setFirstRoom( this.equipmentStore );
		this.No12.setSecondRoom( this.room2 );

		this.No13.setFirstRoom( this.equipmentStore );
		this.No13.setSecondRoom( this.missileControl );

		this.No14.setFirstRoom( this.missileControl );
		this.No14.setSecondRoom( this.room4 );

		this.No15.setFirstRoom( this.equipmentStore );
		this.No15.setSecondRoom( this.room4 );

		this.No16.setFirstRoom( this.sea );
		this.No16.setSecondRoom( this.room4 );

		this.No17.setFirstRoom( this.equipmentStore );
		this.No17.setSecondRoom( this.captainsCabin );

		this.No18.setFirstRoom( this.captainsCabin );
		this.No18.setSecondRoom( this.room4 );

		this.engineRoom.addAdjacentHatch( this.No1 );
		this.engineRoom.addAdjacentHatch( this.No2 );

		this.oxygenPumps.addAdjacentHatch( this.No1 );
		this.oxygenPumps.addAdjacentHatch( this.No3 );
		this.oxygenPumps.addAdjacentHatch( this.No4 );
		this.oxygenPumps.addAdjacentHatch( this.No5 );

		this.reactorRoom.addAdjacentHatch( this.No5 );
		this.reactorRoom.addAdjacentHatch( this.No6 );
		this.reactorRoom.addAdjacentHatch( this.No7 );

		this.missileControl.addAdjacentHatch( this.No10 );
		this.missileControl.addAdjacentHatch( this.No11 );
		this.missileControl.addAdjacentHatch( this.No13 );
		this.missileControl.addAdjacentHatch( this.No14 );

		this.equipmentStore.addAdjacentHatch( this.No12 );
		this.equipmentStore.addAdjacentHatch( this.No13 );
		this.equipmentStore.addAdjacentHatch( this.No15 );
		this.equipmentStore.addAdjacentHatch( this.No17 );

		this.captainsCabin.addAdjacentHatch( this.No17 );
		this.captainsCabin.addAdjacentHatch( this.No18 );

		this.room1.addAdjacentHatch( this.No2 );
		this.room1.addAdjacentHatch( this.No3 );
		this.room1.addAdjacentHatch( this.No6 );

		this.room2.addAdjacentHatch( this.No4 );
		this.room2.addAdjacentHatch( this.No8 );
		this.room2.addAdjacentHatch( this.No9 );
		this.room2.addAdjacentHatch( this.No11 );
		this.room2.addAdjacentHatch( this.No12 );

		this.room3.addAdjacentHatch( this.No9 );
		this.room3.addAdjacentHatch( this.No10 );

		this.room4.addAdjacentHatch( this.No14 );
		this.room4.addAdjacentHatch( this.No15 );
		this.room4.addAdjacentHatch( this.No16 );
		this.room4.addAdjacentHatch( this.No18 );
	}

	public void move( Room from, Room to )
	{

	}
}
