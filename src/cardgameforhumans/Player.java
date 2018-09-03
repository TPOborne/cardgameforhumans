package cardgameforhumans;

import java.util.List;

import cardgameforhumans.factories.DeckFactory;

public class Player {
	
	Deck playersDeck;
	Integer hitpoints;
	Integer armor;
	Hand hand;
	Graveyard graveyard;
	private int openingHandSize = 5;
	
	public Player() {
		playersDeck = DeckFactory.getRandomDeck(20);
		hitpoints = 30;
		armor = 0;
		hand = drawOpeningHand();
		graveyard = new Graveyard();
	}
	
	private Hand drawOpeningHand() {
		Hand hand = new Hand();
		for (int i = 0; i < openingHandSize; i++) {
			hand.addCard(playersDeck.drawFromTop());
		}
		return hand;
	}
}
