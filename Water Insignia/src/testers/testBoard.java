package testers;

import backend.game.Game;
import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;

public class testBoard {

	public static void  main (String[] args){
		boolean moveBoolean;
		Game game = new Game(8,8);
		Warrior DiegoWarrior=new Warrior (1, new ShortSword(), game.getBoard(), game.getAvailability());
		Warrior AlexisWarrior=new Warrior(2, new ShortSword(), game.getBoard(), game.getAvailability());
		game.putPiece(AlexisWarrior, game.getTile(0, 0));
		game.putPiece(DiegoWarrior, game.getTile(0, 1));
		System.out.println(game);
		System.out.println("");
		
		game.removePiece(AlexisWarrior);
		System.out.println(game);
		System.out.println("");
		
		moveBoolean=game.putPiece(AlexisWarrior, game.getTile(0, 0));
		System.out.println(game);
		System.out.println("");
		
		game.move(AlexisWarrior, game.getTile(2, 2));
		System.out.println(game);
		System.out.println("");
		
		System.out.println(game.getDistance(game.getTile(2, 3), game.getTile(1, 0)));
		
		moveBoolean=game.move(DiegoWarrior, game.getTile(6,6));
		System.out.println(game);
		System.out.println(moveBoolean);
		System.out.println("");
	}
}
