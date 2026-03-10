package game.engine;

import game.engine.dataloader.DataLoader;
import game.engine.monsters.Monster;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Game {
	private Board board;
	private ArrayList<Monster> allMonsters;
	private Monster player;
	private Monster opponent;
	private Monster current;
	public Monster getCurrent() {
		return current;
	}
	public void setCurrent(Monster current) {
		this.current = current;
	}
	public Board getBoard() {
		return board;
	}
	public ArrayList<Monster> getAllMonsters() {
		return allMonsters;
	}
	public Monster getPlayer() {
		return player;
	}
	public Monster getOpponent() {
		return opponent;
	}
	
	public Game(Role playerRole) throws IOException{
		board=new Board(DataLoader.readCards());
		allMonsters= DataLoader.readMonsters();
		player=selectRandomMonsterByRole(playerRole);
		if (playerRole==Role.SCARER){
			opponent=selectRandomMonsterByRole(Role.LAUGHER);
		}else{
			opponent=selectRandomMonsterByRole(Role.SCARER);
		}
		setCurrent(player);
	}
	
	private Monster selectRandomMonsterByRole(Role role){
		ArrayList<Monster> scarers=new ArrayList<Monster>();
		ArrayList<Monster> laughers=new ArrayList<Monster>();
		
		for (int i=0; i<allMonsters.size(); i++){
			if(allMonsters.get(i).getRole()==Role.SCARER){
				scarers.add(allMonsters.get(i));
			}else{
				laughers.add(allMonsters.get(i));
			}
		}
		
		if(role==Role.SCARER){
			int random= new Random().nextInt(scarers.size());
			return scarers.get(random);
		}else{
			int random= new Random().nextInt(laughers.size());
			return laughers.get(random);
		}
	}
}
