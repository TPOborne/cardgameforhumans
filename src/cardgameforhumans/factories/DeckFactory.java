package cardgameforhumans.factories;

import cardgameforhumans.Deck;
import cardgameforhumans.Minion;

public class DeckFactory {
	
	public static Deck getRandomDeck(int numberOfCards) {
		Deck deck = new Deck();
		for (int i = 0; i < numberOfCards; i++) {
			deck.addCard(CardFactory.getRandomCard());
		}
		return deck;
	}
	
	public Deck getTempoDeck(int numberOfCards) {
		Deck deck = new Deck();
		for (int i = 0; i < numberOfCards; i++) {
			deck.addCard(new Minion(i,i,i));
		}
		return deck;
	}
	
}
