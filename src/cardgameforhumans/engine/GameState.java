package cardgameforhumans.engine;

import cardgameforhumans.Player;

public class GameState {

	Player player1;
	Player player2;
	
	public GameState() {
		player1 = new Player();
		player2 = new Player();
	}
}
