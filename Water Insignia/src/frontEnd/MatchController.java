package frontEnd;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;

public class MatchController {
	
	private MatchModel model;
	private MatchView view;
	
	public MatchController (MatchModel model, MatchView view){
		
		this.model=model;
		this.view=view;
	}
	
	
	/*
	public void seePosition(int x, int y){
		System.out.println("("+ x + "," + y + ")");
		if((Game.getInstance().getPiece(Game.getInstance().getTile(x, y)))!=null){
			System.out.println(Game.getInstance().getPiece(Game.getInstance().getTile(x, y)));
		}
	}
	*/
	
	/*
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
				Piece newPiece = new Warrior(playerTurn, new ShortSword()); //Cambie esto
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
	*/
	
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

}
