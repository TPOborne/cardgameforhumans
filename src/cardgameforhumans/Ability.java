package cardgameforhumans;

public class Ability {

	private String name;
	private String description;
	private Event type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Event getType() {
		return type;
	}
	public void setType(Event type) {
		this.type = type;
	}
	
}
