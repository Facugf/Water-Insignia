package frontEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		this.view.getPanel().addW1Listener(new Warrior1Listener() );
		this.view.getPanel().addDownListener(new DownListener());
		this.view.getPanel().addUpListener(new UpListener());
		this.view.getPanel().addRightListener(new RightListener());
		this.view.getPanel().addLeftListener(new LeftListener());
		
		
		}
	
	class Warrior1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			model.deployPiece(new Warrior(model.getPlayerTurn(), new ShortSword()));
			model.seePosition();
		}
		
	}
	
	class DownListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			model.addY(1);
			model.seePosition();
		}
			
	}
	
	class UpListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			model.addY(-1);
			model.seePosition();
		}
			
	}
	
	class LeftListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			model.addX(-1);
			model.seePosition();
		}
			
	}
	
	class RightListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			model.addX(1);
			model.seePosition();
		}
			
	}
	
	
	/*
	
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
	
	

}
