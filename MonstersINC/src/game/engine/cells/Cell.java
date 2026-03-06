package game.engine.cells;

import game.engine.monsters.Monster;

public class Cell {
	// Attributes
	private String name;
	private Monster monster;

	// Setters and getters
	public String getName() {
		return name;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	// Constructor
	public Cell(String name) {
		this.name = name;
		monster = null;
	}

}
