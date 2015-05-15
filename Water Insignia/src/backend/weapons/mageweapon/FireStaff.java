package backend.weapons.mageweapon;

import backend.skills.mageSkill.FireBomb;

public class FireStaff extends MageWeapon{

	public FireStaff(){
		super(3, 6, 1);
		
		skills.add(new FireBomb());
	}
}