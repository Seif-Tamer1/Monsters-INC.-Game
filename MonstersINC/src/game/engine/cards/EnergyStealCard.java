package game.engine.cards;

public class EnergyStealCard extends Card{
	// Attributes
	private int energy;
	
	//Setters and Getters
	public int getEnergy(){
		return energy;
	}
	// Constructor
	public EnergyStealCard(String name, String description, int rarity, int energy){
		super(name,description,rarity,true);
		this.energy=energy;
	}

}
