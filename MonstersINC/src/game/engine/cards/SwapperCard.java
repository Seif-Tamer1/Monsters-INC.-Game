package game.engine.cards;

public class SwapperCard extends Card {
	
	// Setters and Getters
	public void getLucky(boolean lucky){
		this.lucky=true;
	}
	// Constructor
	public SwapperCard(String name, String description, int rarity){
		super(name,description,rarity);
		lucky=true;
	}

}
