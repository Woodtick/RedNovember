package server;

import player.Movement;
import player.Player;
import actions.PlayerAction;
import cards.EventCard;
import cards.EventCardDeck;


public class GameManager
{
	
	private EventCardDeck eventCardDeck;
	
	public EventCard drawEventCard()
	{
		return eventCardDeck.drawTopEventCard();
	}
	
	
	public Player getCurrentPlayer()
	{
		return new Player();
	}
	
	public void makeMove(Movement moves)
	{
		
	}
	
	public void makeAction(PlayerAction action)
	{
		
	}
	
	public void evaluateEvent(EventCard event)
	{
		
	}
}
