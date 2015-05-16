package testers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import backend.game.Game;
import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;


public class TestWarrior {

	private  Game game;
	private Warrior DiegoWarrior;
	
	
	
	
	@Before
	public void initialize(){
		
		Game.createGame(10,10);
		DiegoWarrior=new Warrior (1, new ShortSword());
	}
	
	@Test
	public void testWarriorHealth() {
		assertEquals(20, DiegoWarrior.getHealth());
		
	}
	@Test
	public void testWarriorMAxHealth() {
	
		assertEquals(20, DiegoWarrior.getMaxHealth());
		
	}
	@Test
	public void testWarriorDamage() {
	
		assertEquals(15, DiegoWarrior.getDamage());
		
	}
	@Test
	public void testWarriorMovement() {
		
		assertEquals(6,DiegoWarrior.getMovement());
		
	}
	@Test
	public void testWarriorRange() {
		
		assertEquals(1, DiegoWarrior.getRange());
	}
	@Test
	public void testWarriorTeam() {
		
		assertEquals(1, DiegoWarrior.getTeam());
	}
	
	
	//Error porque "weapon" no es la misma instancia de ShorSword que la que tiene Diego. Quizas cambiar el equals??"
	@Test
	public void testWarriorWeapon() {
		ShortSword weapon = new ShortSword();
		
		assertEquals(weapon, DiegoWarrior.getWeapon());
	}


}
