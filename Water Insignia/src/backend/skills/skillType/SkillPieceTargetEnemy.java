package backend.skills.skillType;


import backend.game.Tile;

public abstract class SkillPieceTargetEnemy extends SkillPieceTarget{

	public SkillPieceTargetEnemy(int range){
		super(range);
	}
	
	/**Retorna True si el el lugar seleccionado es valido*/
	@Override
	public boolean checkValidTarget(Tile startingTile, Tile targetTile){
		
		if(super.checkValidTarget(startingTile, targetTile)){
			if(startingTile.getPiece().getTeam() != targetTile.getPiece().getTeam()){
				return true;
			}
		}
		return false;
		
	}
}
