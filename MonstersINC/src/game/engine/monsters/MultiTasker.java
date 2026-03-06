package game.engine.monsters;

import game.engine.Role;

public class MultiTasker extends Monster {
	// Attributes
	private int normalSpeedTurns;

	// constructor
	public MultiTasker(String name, String description, Role originalRole,
			int energy) {
		super(name, description, originalRole, energy);
		this.normalSpeedTurns = 0;
	}

	// getters and setters
	public int getNormalSpeedTurns() {
		return normalSpeedTurns;
	}

	public void setNormalSpeedTurns(int normalSpeedTurns) {
		if (normalSpeedTurns < 0)
			this.normalSpeedTurns = 0;
		else
			this.normalSpeedTurns = normalSpeedTurns;
	}
}
