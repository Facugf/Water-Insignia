package frontEnd;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import backend.Player;
import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;

public class MatchModel { 	

	private int x;
	private int y;
	private ArrayList<Player> players = new ArrayList<Player>();
	private int playerTurn;
	private Tile tileSelected;
	
	public MatchModel(int width, int height, int gold, int nOfPlayers){
		Game.createGame(width,height);
		for(int i=0; i<nOfPlayers; i++){
			players.add(new Player(i+1, gold));
		}
		this.playerTurn = 1;
		this.x=0;
		this.y=0;
		this.tileSelected=new Tile(0,0);
	}
	
	
	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	private void setX(int x){
		this.x = x;
	}

	private void setY(int y){
		this.y = y;
	}

	public void addX(int numberToAdd){
		if(this.x+numberToAdd>=0 && this.x+numberToAdd < Game.getInstance().getWidth()){
			setX(this.x+numberToAdd);
		}
		
	}

	public void addY(int numberToAdd){
		if(this.y+numberToAdd>=0 && this.y+numberToAdd < Game.getInstance().getHeight()){
			setY(this.y+numberToAdd);
		}
	}
	
	public void seePosition(){
		System.out.println("("+ x + "," + y + ")");
		if((Game.getInstance().getPiece(Game.getInstance().getTile(x, y)))!=null){
			System.out.println(Game.getInstance().getPiece(Game.getInstance().getTile(x, y)));
		}
	}



/**
 * 
 * @param newPiece
 * @return true si pudo poner la nueva unidad, false sino. 
 */
public boolean deployPiece (Piece newPiece){
	
	if(players.get(playerTurn-1).getRecursos()>=newPiece.getCost()){
		if(Game.getInstance().putPiece(newPiece, Game.getInstance().getTile(x, y))){
			players.get(playerTurn-1).useRecursos(newPiece.getCost());
		}
		System.out.println(players.get(playerTurn-1).getRecursos());
		return true;
	}
	return false;
}

public int getPlayerTurn(){
	return this.playerTurn;
}





}

