package game.engine.exceptions;

public abstract class GameActionExcption extends Exception  {
	public GameActionExcption() {
		super();
		}
	public GameActionExcption (String message) {
		super(message);
	}

}
