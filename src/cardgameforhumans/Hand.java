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

	public List<Card> getCardsInHand() {
		return cardsInHand;
	}

	public void setCardsInHand(List<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}
	
	public void removeCards(List<Card> cardsToRemove) {
		for (Card c: cardsToRemove) {
			cardsInHand.remove(c);
		}
	}
	
}
