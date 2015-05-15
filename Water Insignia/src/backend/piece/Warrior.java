package backend.piece;

import backend.weapons.warriorweapon.WarriorWeapon;


public class Warrior extends Piece {
	/**
	 * Crea una pieza con 20 de vida, 6 de movilidad y solo puede usar armas de guerrero
	 * @param team
	 * @param weapon
	 */
	public Warrior(int team, WarriorWeapon weapon){
		super(20, team, 6, weapon, "W");
	}
	
	

}
