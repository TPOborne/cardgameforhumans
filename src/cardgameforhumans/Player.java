package cardgameforhumans;

import java.util.List;

import cardgameforhumans.factories.DeckFactory;

public class Player {
	
	Deck deck;
	Integer mana;
	Integer hitpoints;
	Integer armor;
	Hand hand;
	Graveyard graveyard;
	Integer openingHandSize = 5;
	String name;
	
	public Player(String name) {
		deck = DeckFactory.getRandomDeck(20);
		hitpoints = 30;
		armor = 0;
		mana = 0;
		hand = drawOpeningHand();
		graveyard = new Graveyard();
		this.name = name;
	}
	
	private Hand drawOpeningHand() {
		Hand hand = new Hand();
		for (int i = 0; i < openingHandSize; i++) {
			hand.addCard(deck.drawFromTop());
		}
		return hand;
	}

	public Deck getPlayersDeck() {
		return deck;
	}

	public void setPlayersDeck(Deck playersDeck) {
		this.deck = playersDeck;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public void incMana() {
		if (this.mana < 10) {
			this.mana++;
		}
	}
	
	public Integer getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(Integer hitpoints) {
		this.hitpoints = hitpoints;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Graveyard getGraveyard() {
		return graveyard;
	}

	public void setGraveyard(Graveyard graveyard) {
		this.graveyard = graveyard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
