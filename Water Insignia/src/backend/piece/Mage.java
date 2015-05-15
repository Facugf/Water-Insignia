package backend.piece;

import backend.weapons.mageweapon.MageWeapon;

public class Mage extends Piece {
	/**
	 * Crea un mago, una pieza que tiene 20 de vida y 12 de movilidad
	 * y solo puede usar armas de mago
	 * 
	 * @param team
	 * @param weapon
	 */
	public Mage(int team, MageWeapon weapon){
		super(20, team, 12, weapon, "M");
	}
	
	
}
