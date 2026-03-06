package game.engine.monsters;

import game.engine.Role;

public class Dasher extends Monster {
	// Attributes
	private int momentumTurns;

	// constructor
	public Dasher(String name, String description, Role originalRole, int energy) {
		super(name, description, originalRole, energy);
		this.momentumTurns = 0;
	}

	// getters and setters
	public int getMomentumTurns() {
		return momentumTurns;
	}

	public void setMomentumTurns(int momentumTurns) {
		if (momentumTurns < 0)
			this.momentumTurns = 0;
		else
			this.momentumTurns = momentumTurns;
	}
}
