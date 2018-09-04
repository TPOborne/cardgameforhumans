package cardgameforhumans.engine;

import cardgameforhumans.Player;

public class GameState {

	Player player1;
	Player player2;
	
	public GameState() {
		player1 = new Player("Bob");
		player2 = new Player("Barry");
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}


}
