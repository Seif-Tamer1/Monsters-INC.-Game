package game.engine.dataloader;

import game.engine.Role;
import game.engine.cards.Card;
import game.engine.cards.ConfusionCard;
import game.engine.cards.EnergyStealCard;
import game.engine.cards.ShieldCard;
import game.engine.cards.StartOverCard;
import game.engine.cards.SwapperCard;
import game.engine.cells.Cell;
import game.engine.cells.ContaminationSock;
import game.engine.cells.ConveyorBelt;
import game.engine.cells.DoorCell;
import game.engine.monsters.Dasher;
import game.engine.monsters.Dynamo;
import game.engine.monsters.Monster;
import game.engine.monsters.MultiTasker;
import game.engine.monsters.Schemer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataLoader {
	private static final String CARDS_FILE_NAME="cards.csv";
	private static final String CELLS_FILE_NAME="cells.csv";
	private static final String MONSTERS_FILE_NAME="monsters.csv";
	
	
	
	public static ArrayList<Card> readCards() throws IOException{
		String currentLine = "";
		ArrayList<Card> cardsList=new ArrayList<Card>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(CARDS_FILE_NAME))) {

            
            while ((currentLine = br.readLine()) != null) {

               
                String[] rowData = currentLine.split(",");
                
                if (rowData[0].equals("SWAPPER")){
                	cardsList.add(new SwapperCard(rowData[1], rowData[2], Integer.parseInt(rowData[3])));
                }else if ((rowData[0].equals("STARTOVER"))){
                	cardsList.add(new StartOverCard(rowData[1], rowData[2], Integer.parseInt(rowData[3]),Boolean.parseBoolean(rowData[4])));
                }else if ((rowData[0].equals("ENERGYSTEAL"))){
                	cardsList.add(new EnergyStealCard(rowData[1], rowData[2], Integer.parseInt(rowData[3]),Integer.parseInt(rowData[4])));
                }else if ((rowData[0].equals("SHIELD"))){
                	cardsList.add(new ShieldCard(rowData[1], rowData[2], Integer.parseInt(rowData[3])));
                }else if ((rowData[0].equals("CONFUSION"))){
                	cardsList.add(new ConfusionCard(rowData[1], rowData[2], Integer.parseInt(rowData[3]),Integer.parseInt(rowData[4])));
                }
                
                
            }
           
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        return cardsList;
	}
	
	public static ArrayList<Cell> readCells() throws IOException{
		String currentLine = "";
		ArrayList<Cell> cellsList=new ArrayList<Cell>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(CELLS_FILE_NAME))) {

            
            while ((currentLine = br.readLine()) != null) {

               
                String[] rowData = currentLine.split(",");
                
                if (rowData.length==3){
                	cellsList.add(new DoorCell(rowData[0], Role.valueOf(rowData[1]), Integer.parseInt(rowData[2])));
                }else if (rowData.length==2){
                	if (Integer.parseInt(rowData[1])>0){
                	cellsList.add(new ConveyorBelt(rowData[0], Integer.parseInt(rowData[1])));
                	}else{
                	cellsList.add(new ContaminationSock(rowData[0], Integer.parseInt(rowData[1])));
                	}
                }
                
                
            }
           
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        return cellsList;
	}
	
	
	
	public static ArrayList<Monster> readMonsters() throws IOException{
		String currentLine = "";
		ArrayList<Monster> monstersList=new ArrayList<Monster>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(MONSTERS_FILE_NAME))) {

            
            while ((currentLine = br.readLine()) != null) {

               
                String[] rowData = currentLine.split(",");
                
                if (rowData[0].equals("MULTITASKER")){
                	monstersList.add(new MultiTasker(rowData[1], rowData[2], Role.valueOf(rowData[3]), Integer.parseInt(rowData[4])));
                }else if ((rowData[0].equals("DASHER"))){
                	monstersList.add(new Dasher(rowData[1], rowData[2], Role.valueOf(rowData[3]), Integer.parseInt(rowData[4])));
                }else if ((rowData[0].equals("DYNAMO"))){
                	monstersList.add(new Dynamo(rowData[1], rowData[2], Role.valueOf(rowData[3]), Integer.parseInt(rowData[4])));
                }else if ((rowData[0].equals("SCHEMER"))){
                	monstersList.add(new Schemer(rowData[1], rowData[2], Role.valueOf(rowData[3]), Integer.parseInt(rowData[4])));
                }
                
                
            }
           
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        return monstersList;
	}
}
