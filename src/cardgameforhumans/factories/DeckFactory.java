package cardgameforhumans.factories;

import java.util.ArrayList;
import java.util.List;

import cardgameforhumans.Card;
import cardgameforhumans.Deck;
import cardgameforhumans.Minion;

public class DeckFactory {
	
	public Deck getRandomDeck(int numberOfCards) {
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
