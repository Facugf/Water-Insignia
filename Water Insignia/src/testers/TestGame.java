package testers;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import backend.game.Board;
import backend.game.Game;

public class TestGame {

	
	@BeforeClass
	public void Initialization(){
		Game.createGame(10, 10);
	}
	
	@Test
	public void testBoard(){
		//assertTrue(Game.getInstance().getBoard().equals(new Board(10,10)));
	}
	

}
