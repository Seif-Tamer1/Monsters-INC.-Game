package game.engine.cells;

public class ConveyorBelt extends TransportCell {
	// Constructor
	public ConveyorBelt(String name, int effect) {
		super(name, Math.abs(effect));
	}
}
