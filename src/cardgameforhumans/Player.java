package cardgameforhumans;

import java.util.List;

public class Player {

	
	Deck playersDeck;
	Integer hitpoints;
	Integer armor;
	Hand hand;
	Graveyard graveyard;
	
	public Player() {
		playersDeck = new Deck();
		hitpoints = 30;
		armor = 30;
		hand = new Hand();
		graveyard = new Graveyard();
		
	}
}
