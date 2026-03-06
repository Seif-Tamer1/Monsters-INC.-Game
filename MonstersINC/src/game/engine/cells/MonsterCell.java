package game.engine.cells;

import game.engine.monsters.Monster;

public class MonsterCell extends Cell{
	//Attributes
	private Monster cellMonster;

	//Setters and Getters
	public Monster getCellMonster() {
		return cellMonster;
	}
	
	//Constructor
	public MonsterCell(String name, Monster cellMonster){
		super(name);
		this.cellMonster=cellMonster;
	}
	
}
