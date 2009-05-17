package cards;

import java.util.Observable;
import java.util.Random;
import java.util.Vector;

public class EventCardDeck extends Observable
{
	private Vector<EventCard> drawPile;
	private Vector<EventCard> discardPile;
	private EventCard newlyDrawnEventCard;

	public EventCardDeck()
	{
		this.buildPile();
	}

	private void buildPile()
	{
		this.drawPile = new Vector<EventCard>();
		this.discardPile = new Vector<EventCard>();

		this.drawPile.add( new HatchLocked( 1 ) );
		this.drawPile.add( new HatchLocked( 0 ) );
		this.drawPile.add( new HatchLocked( 1 ) );
		this.drawPile.add( new HatchLocked( 2 ) );
		this.drawPile.add( new HatchLocked( 2 ) );
		this.drawPile.add( new HatchLocked( 3 ) );
		this.drawPile.add( new HatchLocked( 4 ) );
		this.drawPile.add( new HatchLocked( 4 ) );
		this.drawPile.add( new HatchLocked( 2 ) );
		this.drawPile.add( new HatchLocked( 4 ) );

		this.drawPile.add( new ReactorMalfunction( 4 ) );
		this.drawPile.add( new ReactorMalfunction( 1 ) );

		this.drawPile.add( new Respite( 0 ) );
		this.drawPile.add( new Respite( 0 ) );
		this.drawPile.add( new Respite( 0 ) );
		this.drawPile.add( new Respite( 1 ) );
		this.drawPile.add( new Respite( 1 ) );
		this.drawPile.add( new Respite( 2 ) );
		this.drawPile.add( new Respite( 3 ) );
		this.drawPile.add( new Respite( 4 ) );

		this.drawPile.add( new ReactorWarmup( 0 ) );
		this.drawPile.add( new ReactorWarmup( 2 ) );
		this.drawPile.add( new ReactorWarmup( 3 ) );
		this.drawPile.add( new ReactorWarmup( 1 ) );
		this.drawPile.add( new ReactorWarmup( 3 ) );
		this.drawPile.add( new ReactorWarmup( 4 ) );

		this.discardPile.add( new Descent( 2 ) );
		this.discardPile.add( new Descent( 2 ) );
		this.discardPile.add( new Descent( 4 ) );
		this.discardPile.add( new Descent( 3 ) );
		this.discardPile.add( new Descent( 0 ) );
		this.discardPile.add( new Descent( 4 ) );

		this.discardPile.add( new UnderwaterCurrent( 3 ) );

		this.discardPile.add( new FireSpreads( 4 ) );
		this.discardPile.add( new FireSpreads( 0 ) );
		this.discardPile.add( new FireSpreads( 3 ) );

		this.discardPile.add( new Fire( 2 ) );
		this.discardPile.add( new Fire( 1 ) );
		this.discardPile.add( new Fire( 4 ) );
		this.discardPile.add( new Fire( 0 ) );
		this.discardPile.add( new Fire( 2 ) );
		this.discardPile.add( new Fire( 4 ) );
		this.discardPile.add( new Fire( 3 ) );
		this.discardPile.add( new Fire( 0 ) );

		this.discardPile.add( new EngineDown( 4 ) );
		this.discardPile.add( new OxygenPumpsDown( 0 ) );
		this.discardPile.add( new MissileCountdown( 3 ) );
		this.drawPile.add( new Kraken( 1 ) );
		this.drawPile.add( new MissileCountdown( 0 ) );

		this.drawPile.add( new Stumble( 4 ) );
		this.drawPile.add( new Stumble( 2 ) );

		this.drawPile.add( new Overheated( 2 ) );

		this.drawPile.add( new FastDescent( 1 ) );

		this.drawPile.add( new Turbulence( 4 ) );
		this.drawPile.add( new Turbulence( 3 ) );

		this.drawPile.add( new Leak( 2 ) );
		this.drawPile.add( new Leak( 0 ) );

		this.drawPile.add( new FriendlyFire( 3 ) );

		this.shufflePile( this.drawPile );
	}

	public EventCard drawTopEventCard()
	{
		if ( this.drawPile.size() == 0 )
		{
			this.resetEventCardPile();
		}

		this.newlyDrawnEventCard = this.drawPile.remove( 0 );
		this.discardPile.add( this.newlyDrawnEventCard );
		this.setChanged();
		this.notifyObservers();
		return this.newlyDrawnEventCard;
	}

	public int getDiscardPileSize()
	{
		return this.discardPile.size();
	}

	public int getDrawPileSize()
	{
		return this.drawPile.size();
	}

	public EventCard getNewlyDrawnEventCard()
	{
		return this.newlyDrawnEventCard;
	}

	// When the current pile of cards is used up, the current pile
	// will be filled up with the discard pile and shuffled.
	public void resetEventCardPile()
	{
		this.drawPile.clear();
		this.drawPile.addAll( this.discardPile );
		this.shufflePile( this.drawPile );
	}

	private void shufflePile( Vector<EventCard> pile )
	{
		Vector<EventCard> shuffledPile = new Vector<EventCard>();

		Random randomizer = new Random();
		randomizer.setSeed( System.currentTimeMillis() );

		int randomNumber = 0;

		while ( !pile.isEmpty() )
		{
			randomNumber = ( ( Math.abs( randomizer.nextInt() ) % pile.size() ) );
			shuffledPile.add( pile.remove( randomNumber ) );
		}

		pile.clear();
		pile.addAll( shuffledPile );
	}
}
