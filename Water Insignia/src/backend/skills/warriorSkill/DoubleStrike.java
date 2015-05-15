package backend.skills.warriorSkill;

import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.skills.skillType.SkillPieceTarget;

//Falta El team. En la implementacion, deberia checkear si es valido el target, para luego atacar. 
public class DoubleStrike extends SkillPieceTarget{
	
	
	public DoubleStrike() {
		super(1);
		
	}
	
	public void useSkill(Tile startingTile, Tile targetTile){
		Piece myselfPiece = Game.getInstance().getPiece(startingTile);
		Piece targetPiece = Game.getInstance().getPiece(targetTile);
		if(targetPiece!=null){
			targetPiece.receiveDamage(myselfPiece.getDamage()*2);
		}
	}

}

