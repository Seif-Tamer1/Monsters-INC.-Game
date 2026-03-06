package game.engine.cards;

public class ConfusionCard extends Card {
	// Attributes 
	private int duration;
	
	//Setters and getters
	public int getDuration(){
		return duration;
	}
	
	// Constructor
	public ConfusionCard(String name, String description, int rarity, int duration){
		super(name,description,rarity,false);
		this.duration=duration;
	}

}
