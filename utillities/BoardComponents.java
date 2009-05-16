package utillities;

import java.awt.Point;
import java.util.TreeMap;

public class BoardComponents
{
	public static TreeMap<Integer,Point> GREEN_TOKEN_COORDINATES = new TreeMap<Integer,Point>();
	public static TreeMap<Integer,Point> RED_TOKEN_COORDINATES = new TreeMap<Integer,Point>();
	public static TreeMap<Integer,Point> BLUE_TOKEN_COORDINATES = new TreeMap<Integer,Point>();
	
	public static Point EVENT_CARD_PILE_COORDINATES = new Point(1060,20);
	
	// set this to move the gameboard position
	public static Point BOARD_UPPER_LEFT_CORNER = new Point(0,0);
	
	public static void initializeBoardComponents()
	{
		GREEN_TOKEN_COORDINATES.put( new Integer(1), new Point(BOARD_UPPER_LEFT_CORNER.x + 92,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(2), new Point(BOARD_UPPER_LEFT_CORNER.x + 125,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(3), new Point(BOARD_UPPER_LEFT_CORNER.x + 162,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(4), new Point(BOARD_UPPER_LEFT_CORNER.x + 197,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(5), new Point(BOARD_UPPER_LEFT_CORNER.x + 232,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(6), new Point(BOARD_UPPER_LEFT_CORNER.x + 268,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(7), new Point(BOARD_UPPER_LEFT_CORNER.x + 303,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(8), new Point(BOARD_UPPER_LEFT_CORNER.x + 340,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(9), new Point(BOARD_UPPER_LEFT_CORNER.x + 375,BOARD_UPPER_LEFT_CORNER.y+54) );
		GREEN_TOKEN_COORDINATES.put( new Integer(10), new Point(BOARD_UPPER_LEFT_CORNER.x + 412,BOARD_UPPER_LEFT_CORNER.y+54) );
		
		RED_TOKEN_COORDINATES.put( new Integer(1), new Point(BOARD_UPPER_LEFT_CORNER.x + 92,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(2), new Point(BOARD_UPPER_LEFT_CORNER.x + 125,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(3), new Point(BOARD_UPPER_LEFT_CORNER.x + 162,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(4), new Point(BOARD_UPPER_LEFT_CORNER.x + 197,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(5), new Point(BOARD_UPPER_LEFT_CORNER.x + 232,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(6), new Point(BOARD_UPPER_LEFT_CORNER.x + 268,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(7), new Point(BOARD_UPPER_LEFT_CORNER.x + 303,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(8), new Point(BOARD_UPPER_LEFT_CORNER.x + 340,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(9), new Point(BOARD_UPPER_LEFT_CORNER.x + 375,BOARD_UPPER_LEFT_CORNER.y+104) );
		RED_TOKEN_COORDINATES.put( new Integer(10), new Point(BOARD_UPPER_LEFT_CORNER.x + 412,BOARD_UPPER_LEFT_CORNER.y+104) );
		
		BLUE_TOKEN_COORDINATES.put( new Integer(1), new Point(BOARD_UPPER_LEFT_CORNER.x + 92,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(2), new Point(BOARD_UPPER_LEFT_CORNER.x + 125,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(3), new Point(BOARD_UPPER_LEFT_CORNER.x + 162,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(4), new Point(BOARD_UPPER_LEFT_CORNER.x + 197,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(5), new Point(BOARD_UPPER_LEFT_CORNER.x + 232,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(6), new Point(BOARD_UPPER_LEFT_CORNER.x + 268,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(7), new Point(BOARD_UPPER_LEFT_CORNER.x + 303,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(8), new Point(BOARD_UPPER_LEFT_CORNER.x + 340,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(9), new Point(BOARD_UPPER_LEFT_CORNER.x + 375,BOARD_UPPER_LEFT_CORNER.y+154) );
		BLUE_TOKEN_COORDINATES.put( new Integer(10), new Point(BOARD_UPPER_LEFT_CORNER.x + 412,BOARD_UPPER_LEFT_CORNER.y+154) );
	}
}