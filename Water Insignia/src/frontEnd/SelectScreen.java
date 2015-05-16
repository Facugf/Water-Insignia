package frontEnd;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;

public class SelectScreen {

	
	private int nOfPlayers;
	private int gold;
	private ArrayList<ArrayList<Piece>> playersPieces;
	private int playerTurn;
	
	public SelectScreen(){
		this.nOfPlayers=2;
		this.gold=10;
		this.playersPieces = new ArrayList();
		this.playerTurn=1;
	}


public class AL extends KeyAdapter{
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		//Case
			
		
		if(keyCode==e.VK_1){
			addPiece(new Warrior(playerTurn, new ShortSword()));
		}
		
}
	
	public void addPiece(Piece piece){
		
		playersPieces.get(playerTurn).add(piece);
		
		}
	}
}	
