package cardgameforhumans.factories;

import java.util.Random;

import cardgameforhumans.Card;
import cardgameforhumans.Minion;

public class CardFactory {

	public static Card getRandomCard() {
		int cost = getRand(0, 10);
		int health = getRand(1, 10);
		int attack = getRand(0, 10);
		Minion m = new Minion(cost, attack, health);
		return m;
	}
	
	private static int getRand(int min, int max) {
		Random rn = new Random();
		return rn.nextInt(max - min + 1) + min;
	}
	
}
