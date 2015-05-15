package backend.skills.skillType;

import backend.game.Game;
import backend.game.Tile;

public abstract class SkillTarget implements Skill {

	private int range;
	
	public SkillTarget(int range){
		this.range = range;
	}
	
	/**Retorna True si el el lugar seleccionado es valido*/
	public boolean checkValidTarget(Tile startingTile, Tile targetTile){
		
		return Game.getInstance().getDistance(startingTile, targetTile)<= range;

	}
}
