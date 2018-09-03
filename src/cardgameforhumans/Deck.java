package cardgameforhumans;

import java.util.ArrayList;
import java.util.List;

public class Deck {
		
	List<Card> initializedDeck;
	
	public Deck() {
		this.initializedDeck = new ArrayList<>(30);
	}
	
	public Deck(int numberOfCards) {
		this.initializedDeck = new ArrayList<>();
		for (int i = 0; i < numberOfCards-1; i++) {
			this.initializedDeck.add(new Minion(i,i,i));
		}
	}
	
	public Card drawFromTop() {
		if(initializedDeck.isEmpty()) {
			return initializedDeck.get(initializedDeck.size()-1);
		} else {
			return null;
		}
	}

}
