package game.engine.cells;

public abstract class TransportCell extends Cell {
	// Attributes
	private int effect;

	// Setters and Getters
	public int getEffect() {
		return effect;
	}

	// Constructor
	public TransportCell(String name, int effect) {
		super(name);
		this.effect = effect;
	}
}
