
package backend.skills.mageSkill;

import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.skills.skillType.SkillTarget;

public class FireBomb extends SkillTarget {

	public FireBomb() {
		super(6);
	}

	@Override
	public void useSkill(Tile startingTile, Tile targetTile) {
		for (int i=-1; i<=1; i++){
			for(int j=-1; j<=1; j++){
				if(targetTile.getPositionX()+i>=0 && targetTile.getPositionX()+i<Game.getInstance().getWidth()){
				
					if(targetTile.getPositionY()+j>=0 && targetTile.getPositionY()+j<Game.getInstance().getHeight()){
					
						Piece newTargetPiece = Game.getInstance().getPiece(Game.getInstance().getTile(targetTile.getPositionX()+i, targetTile.getPositionY()+j));
						if(newTargetPiece!=null){
							
						newTargetPiece.receiveDamage(10);
							
						}
					}
				}
			}
		}
		
	}

	
}
