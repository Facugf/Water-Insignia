package backend.weapons;

import java.util.ArrayList;

import backend.game.Game;
import backend.game.Tile;
import backend.skills.skillType.Skill;

public abstract class Weapon {

	private int damage;
	public ArrayList<Skill> skills;
	private int range;
	private int cost;
	
	public Weapon(int damage, int range, int cost){
		this.damage = damage;
		this.range = range;
		this.cost = cost;
		this.skills = new ArrayList<Skill>();
	}
	
	public int getDamage(){
		return this.damage;
	}
	
	public int getRange(){
		return this.range;
	}
	
	public ArrayList<Skill> getSkill(){
	  return this.skills;
	}
	
	public String toString(){
		return "(Damage=" + damage + " Range=" + range+")";
	}
	
	public boolean tryToSkill(Tile StartingTile, Tile TargetTile, int skillNumber){
		if(Game.getInstance().getPiece(StartingTile)==null) { //Creo que no va a ser nunca
			return false;
		}
		if(skills.size()<= skillNumber){
			return false;
		}
		if(skills.get(skillNumber).checkValidTarget(StartingTile, TargetTile)){
			skills.get(skillNumber).useSkill(StartingTile, TargetTile);
			return true;
		}
		return false;
		
	}
	public int getCost(){
		return this.cost;
	}
}  

