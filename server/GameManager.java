package server;

import java.util.Vector;

import player.Movement;
import player.Player;
import actions.PlayerAction;
import cards.EventCard;
import cards.EventCardDeck;


public class GameManager
{
	
	private EventCardDeck eventCardDeck;
	private Player currentPlayer;
	private Vector<Player> allPlayers;
	
	public GameManager()
	{
		this.currentPlayer = null;
		this.allPlayers = new Vector<Player>();
	}
	
	public void setCurrentPlayer( Player currentPlayer )
	{
		this.currentPlayer = currentPlayer;
	}

	public Player calculateCurrentPlayer()
	{
		int min = allPlayers.get( 0 ).getTime();
		Vector<Player> playersWithMinimumTime = new Vector<Player>();
		Player currentPlayer = null;
		
		for( Player p : allPlayers )
		{
			if( p.getTime() <= min )
				playersWithMinimumTime.add( p );
		}
		
		int maxID = playersWithMinimumTime.get( 0 ).getTurnID();
		
		for( Player p : playersWithMinimumTime )
		{
			if( p.getTurnID() > maxID )
				currentPlayer = p;
		}
		
		return currentPlayer;
	}

	public EventCard drawEventCard()
	{
		return eventCardDeck.drawTopEventCard();
	}
	
	
	public Player getCurrentPlayer()
	{
		return this.currentPlayer;
	}
	
	public void makeMove(Movement moves)
	{
		this.currentPlayer;
	}
	
	public void makeAction(PlayerAction action)
	{
		
	}
	
	public void evaluateEvent(EventCard event)
	{
		
	}
}
