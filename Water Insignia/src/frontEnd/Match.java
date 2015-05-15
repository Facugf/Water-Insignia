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

public class Match { /*Match deberia ser Backend porque todo lo de cargas, 
	recursos y deploy deberia poder hacerse desde el back. Algo deberia ahber entre el Front
	y match. 
	*/
	

	private int x; //Ya no son final. Mal?
	private int y;
	private ArrayList<Player> players = new ArrayList<Player>();
	private int playerTurn;
	private Tile tileSelected;
	
	public Match(int width, int height, int gold, int nOfPlayers){
		Game.createGame(width,height);
		for(int i=0; i<nOfPlayers; i++){
			players.add(new Player(i+1, gold));
		}
		this.playerTurn = 1;
		this.x=0;
		this.y=0;
		this.tileSelected=new Tile(0,0);
	}
	
	public void seePosition(int x, int y){
		System.out.println("("+ x + "," + y + ")");
		if((Game.getInstance().getPiece(Game.getInstance().getTile(x, y)))!=null){
			System.out.println(Game.getInstance().getPiece(Game.getInstance().getTile(x, y)));
		}
	}

public class AL extends KeyAdapter{
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		//Case
		if(keyCode==e.VK_LEFT){
			if(y>0){
				y--;
			}
			
		}
		if(keyCode==e.VK_RIGHT){
			if(y<((Game.getInstance().getWidth())-1)){
				y++;
			}
			
		}
		if(keyCode==e.VK_UP){
			if(x>0){
				x--;
			}
			
		}
		if(keyCode==e.VK_DOWN){
			if(x<((Game.getInstance().getHeight())-1)){
				x++;
			}
			
		}
		
		
		
		if(keyCode==e.VK_1){
			Piece newPiece = new Warrior(players.get(playerTurn-1).getTeam(), new ShortSword());
			deployPiece(newPiece);
			System.out.println(Game.getInstance());
		}
		
		if(keyCode==e.VK_ENTER){
			if(playerTurn==players.size()){
				playerTurn=1;
			}
			else{
				playerTurn=playerTurn+1;
			}
			System.out.println(Game.getInstance());
		}
		//tileSelected empieza como null
		if(keyCode==e.VK_S){
			tileSelected=Game.getInstance().getTile(x, y);
		}
		
		//Podes mover null, error
		if(keyCode == e.VK_M){
			Tile newTileSelected = Game.getInstance().getTile(x, y);
			Game.getInstance().getPiece(tileSelected).move(newTileSelected);
			tileSelected=newTileSelected;
			System.out.println(Game.getInstance());
		}
		
		if(keyCode == e.VK_A){
			Tile newTileSelected = Game.getInstance().getTile(x, y);
			Game.getInstance().getPiece(tileSelected).attack(newTileSelected);
			System.out.println(Game.getInstance());
		}
		if(keyCode == e.VK_H){
			Tile newTileSelected = Game.getInstance().getTile(x, y);
			Game.getInstance().useSkill(tileSelected, newTileSelected, 0);
			System.out.println(Game.getInstance());
		}
		if(keyCode == e.VK_J){
			Tile newTileSelected = Game.getInstance().getTile(x, y);
			Game.getInstance().useSkill(tileSelected, newTileSelected, 1);
			System.out.println(Game.getInstance());
		}
		if(keyCode == e.VK_K){
			Tile newTileSelected = Game.getInstance().getTile(x, y);
			Game.getInstance().useSkill(tileSelected, newTileSelected, 2);
			System.out.println(Game.getInstance());
		}
			
		seePosition(x,y);
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

/*
public int getX(){
	return this.x;
}

public int getY(){
	return this.y;
}

public void setX(int x){
	this.x = x;
}

public void setY(int y){
	this.y = y;
}

public void addX(int numberToAdd){
	setX(this.x+numberToAdd);
}

public void addY(int numberToAdd){
	setX(this.y+numberToAdd);
}
*/

public static void main(String[] args) {
	Display d=new Display();
	Match match = new Match(8,8,10,2);
	AL keyL1=match.new AL();
	d.addKeyListener(keyL1);
	}

}

