package testers;

import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;
public class TestAttack {

	public static void main(String[] args) {
		boolean boardBoolean;
		Game game = new Game(8,8);
		Warrior DiegoWarrior=new Warrior (1, new ShortSword() , game.getBoard(), game.getAvailability());
		Warrior AlexisWarrior=new Warrior(2, new ShortSword(), game.getBoard(), game.getAvailability());
		Warrior FlacuWarrior=new Warrior(3, new ShortSword(), game.getBoard(), game.getAvailability());
		game.putPiece(AlexisWarrior, game.getTile(0,0));
		game.putPiece(DiegoWarrior, game.getTile(0,1));
		game.putPiece(FlacuWarrior, game.getTile(0,2));
		System.out.println(game);
		System.out.println("");
		
		
		boardBoolean=game.attackInRange(AlexisWarrior, game.getTile(0, 1));
		
		System.out.println(game);
		System.out.println(boardBoolean);
		System.out.println("");
		
		boardBoolean=game.attackInRange(AlexisWarrior, game.getTile(0, 2));
		
		System.out.println(game);
		System.out.println(boardBoolean);
		System.out.println("");
		
		boardBoolean=game.attackInRange(AlexisWarrior, game.getTile(0, 1));
		
		System.out.println(game);
		System.out.println(boardBoolean);
		System.out.println("");
		
		
	}
}
