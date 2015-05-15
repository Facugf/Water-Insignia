package backend.skills.skillType;


import backend.game.Tile;

//Falta El team. En la implementacion, deberia checkear si es valido el target, para luego atacar. 
public interface Skill {

	
	public void useSkill(Tile startingTile, Tile targetTile);
	
	/**Retorna True si el el lugar seleccionado es valido*/
	public boolean checkValidTarget(Tile startingTile, Tile targetTile);
}


