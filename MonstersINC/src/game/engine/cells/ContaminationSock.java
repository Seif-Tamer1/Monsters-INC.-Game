package game.engine.cells;

import game.engine.interfaces.CanisterModifier;

public class ContaminationSock extends TransportCell implements CanisterModifier{
	//Constructor
	ContaminationSock(String name, int effect){
		super(name, effect);
	}
	
	// method from interface must be added to avoid error
	public void modifyEnergy(){
		
	}
}
