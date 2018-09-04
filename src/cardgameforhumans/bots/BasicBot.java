package cardgameforhumans.bots;

import java.util.ArrayList;
import java.util.List;

import cardgameforhumans.Card;
import cardgameforhumans.Minion;
import cardgameforhumans.Player;

public class BasicBot {

	public List<Card> playCards(Player player) {
		List<Card> playedCards = new ArrayList<>();
		int activeMana = player.getMana();
		for (Card card: player.getHand().getCardsInHand()) {
			if (card.getMana() <= activeMana) {
				activeMana -= card.getMana();
				playedCards.add(card);
				System.out.println(player.getName() + " played " + card.getName() + " (" + card.getMana() + " mana " + ((Minion) card).getAttack() + "/" + ((Minion) card).getHealth() + ")");
			}
		}
		player.getHand().removeCards(playedCards);
		if (playedCards.size() == 0) {
			System.out.println(player.getName() + " played nothing.");
		}
		return playedCards;
	}
	
	public void drawCard(Player player) {
		player.getHand().addCard(player.getPlayersDeck().drawFromTop());
	}
	
	public void gainMana(Player player) {
		player.incMana();
	}
	
	public void takeTurn(Player player) {
		gainMana(player);
		drawCard(player);
		playCards(player);
	}
	
}
