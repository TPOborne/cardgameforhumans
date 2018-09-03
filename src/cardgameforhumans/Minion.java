package cardgameforhumans;

import cardgameforhumans.factories.NameFactory;

public class Minion extends Card {
	
	private int attack;
	private int health;
	private Faction faction;
	
	public Minion(int cost,int attack,int health) {
		this.setMana(cost);
		this.setAttack(attack);
		this.setHealth(health);
		this.setName(NameFactory.getName());
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public Faction getFaction() {
		return faction;
	}
	public void setFaction(Faction faction) {
		this.faction = faction;
	}
	
}
