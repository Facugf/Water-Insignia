package backend.skills.warriorSkill;


import backend.game.Game;
import backend.game.Tile;
import backend.piece.Piece;
import backend.skills.skillType.SkillTarget;

public class BroadSlash extends SkillTarget {

	public BroadSlash() {
		super(1);
	}
	
	private int differenceX(Tile startingTile, Tile targetTile){
		return Math.abs(startingTile.getPositionX()-targetTile.getPositionX());
	}
	
	private int differenceY(Tile startingTile, Tile targetTile){
		return Math.abs(startingTile.getPositionY()-targetTile.getPositionY());
	}

	@Override
	public void useSkill(Tile startingTile, Tile targetTile) {
		if(differenceX(startingTile,targetTile)>differenceY(startingTile,targetTile)){
			//Mismo eje X
			for(int i=-1; i<=1; i++){
				if(targetTile.getPositionY()+i>=0 && targetTile.getPositionY()+i<Game.getInstance().getHeight()){
					//No esta en el Tablero
					Piece piece = Game.getInstance().getPiece(Game.getInstance().getTile(targetTile.getPositionX(), targetTile.getPositionY()+i));
					if(piece!=null){
						//No es null. Entonces es una Pieza.
						piece.receiveDamage(Game.getInstance().getPiece(startingTile).getDamage());
					}
				}
				}
			}
		else{
			//Mismo eje Y
			for(int i=-1; i<=1; i++){
				if(targetTile.getPositionX()+i>=0 && targetTile.getPositionX()+i<Game.getInstance().getWidth()){
					//No esta en el Tablero
					Piece piece = Game.getInstance().getPiece(Game.getInstance().getTile(targetTile.getPositionX()+i, targetTile.getPositionY()));
					if(piece!=null){
						//No es null. Entonces es una Pieza.
						piece.receiveDamage(Game.getInstance().getPiece(startingTile).getDamage());
					}
				}
			}
			}
		}
	

	@Override
	public boolean checkValidTarget(Tile startingTile, Tile targetTile){
		if(super.checkValidTarget(startingTile, targetTile)){
			if(startingTile!=targetTile){//Equals de Tile?
				return true;
			}
		}
		return false;
	}
}
