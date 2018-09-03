package cardgameforhumans;

import java.util.ArrayList;
import java.util.List;

public class Deck {
		
	List<Card> initializedDeck;
	
	public Deck() {
		this.initializedDeck = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		this.initializedDeck.add(card);
	}
	
	public void removeCard(Card card) {
		this.initializedDeck.remove(card);
	}
	
	public Card drawFromTop() {
		if(!initializedDeck.isEmpty()) {
			int index = initializedDeck.size() - 1;
			Card card = initializedDeck.get(index);
			initializedDeck.remove(card);
			return card;
		} else {
			return null;
		}
	}

}
