package cardgameforhumans.engine;

import cardgameforhumans.Player;
import cardgameforhumans.bots.BasicBot;

public class Play {
	static BasicBot b;

	public static void main(String[] args) {
		GameState gs = new GameState();
		b = new BasicBot();
		takeTurns(10, gs.getPlayer1(), gs.getPlayer2());
	}
	
	private static void takeTurns(int turns, Player p1, Player p2) {
		for (int i = 0; i < turns; i++) {
			System.out.println("=== ROUND " + (i + 1) + " ===");
			b.takeTurn(p1);
			b.takeTurn(p2);
		}
	}

}
