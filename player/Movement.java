package player;

import java.util.Stack;

import submarine.Room;
import utillities.ItemIdentifier;

public class Movement
{
	private Stack<Move> previousMovements;
	
	public Movement()
	{
		this.previousMovements = new Stack<Move>();
	}
	
	public void move( Player player, Room from, Room to )
	{
		Move currentMove = new Move();
		currentMove.setRoom(from);
		
		if( from.isOnHalfWater() )
		{
			player.setTime( player.getTime() + 2 );
			currentMove.setTimeUsed( 2 );
		}
		else
		{
			player.setTime( player.getTime() + 1 );
			currentMove.setTimeUsed( 1 );
		}
		
		this.previousMovements.push( currentMove );
		
		if ( to.isSeaRoom() && player.getRucksack().containsItem( ItemIdentifier.AQUALUNG ) )
		{
			// ask gamelogic ok
		}
	
		else if ( to.isSeaRoom() && !player.getRucksack().containsItem( ItemIdentifier.AQUALUNG ) )
		{
			// nicht ok
		}
	
		// Raum
		else
		{
			
		}
	}
}
