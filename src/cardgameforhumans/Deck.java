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
	
	public Card drawFromTop() {
		if(initializedDeck.isEmpty()) {
			return initializedDeck.get(initializedDeck.size()-1);
		} else {
			return null;
		}
	}

}
