package game.engine.cells;

import game.engine.Role;
import game.engine.interfaces.CanisterModifier;

public class DoorCell extends Cell implements CanisterModifier{
	//Attributes
	private Role role;
	private int energy;
	private boolean activated;
	
	//Setters and Getters
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public Role getRole() {
		return role;
	}
	public int getEnergy() {
		return energy;
	}
	
	//Constructor
	public  DoorCell(String name, Role role, int energy){
		super(name);
		this.role=role;
		this.energy=energy;
		activated=false;
	}
	
	// method from interface must be added to avoid error
	public void modifyEnergy(){
		
	}
	
}
