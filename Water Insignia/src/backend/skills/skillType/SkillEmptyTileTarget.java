package backend.skills.skillType;

import backend.game.Game;
import backend.game.Tile;

public abstract class SkillEmptyTileTarget extends SkillTarget {

	public SkillEmptyTileTarget(int range){
		super(range);
	}
	
	/**Retorna True si el el lugar seleccionado es valido*/
	@Override
	public boolean checkValidTarget(Tile startingTile, Tile targetTile){
		
		if(super.checkValidTarget(startingTile, targetTile)){
			if(Game.getInstance().getPiece(targetTile)==null){
				return true;
			}
		}
		return false;
		
	}

	
}
