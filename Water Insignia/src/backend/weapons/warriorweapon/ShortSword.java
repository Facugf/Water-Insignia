package backend.weapons.warriorweapon;


import backend.skills.warriorSkill.BroadSlash;
import backend.skills.warriorSkill.DoubleStrike;
import backend.skills.warriorSkill.TacticalWithdrawal;

public class ShortSword extends WarriorWeapon {
	
	public ShortSword(){
		super(15, 1, 1);
		
		skills.add(new DoubleStrike());
		skills.add(new TacticalWithdrawal());
		skills.add(new BroadSlash());
	}
	
	
}
