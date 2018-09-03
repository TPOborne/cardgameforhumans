package cardgameforhumans;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	List<Card> cardsInHand;
	
	public Hand() {
		this.cardsInHand = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		this.cardsInHand.add(card);
	}
	
}
