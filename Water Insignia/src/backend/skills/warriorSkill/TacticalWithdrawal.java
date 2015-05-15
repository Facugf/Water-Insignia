package backend.skills.warriorSkill;

import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.skills.skillType.SkillEmptyTileTarget;

public class TacticalWithdrawal extends SkillEmptyTileTarget{
	public TacticalWithdrawal(){
		super(6);
	}

	@Override
	public void useSkill(Tile startingTile, Tile targetTile) {
		Piece myselfPiece =startingTile.getPiece();
		myselfPiece.move(targetTile);		
	}

}
