package backend.piece;


import java.util.ArrayList;

import backend.game.Game;
import backend.game.Tile;
import backend.skills.skillType.Skill;
import backend.weapons.Weapon;


public abstract class Piece {
	
	
	private Tile position=null;
	private int health;
	private int maxHealth;
	private Weapon weapon;
	private int team;
	private int movement;
	private String name;
	
	
	public Piece(int maxHealth, int team, int movement, Weapon weapon, String name){
		this.health=maxHealth;
		this.maxHealth=maxHealth;
		this.team=team;
		this.weapon=weapon;
		this.movement=movement;
		this.name = name+team;
		
	}
	
	public String getName(){
		return name;
	}
	
/**
 * Reduce la health de la pieza.
 * @param damage Daño realizado sobre la pieza
 * @return true Si mato a la pieza
 * 			false Caso contrario
 */
	public boolean receiveDamage(int damage){
		if(health<=damage){
			this.setHealth(0);
			Game.getInstance().removePiece(this);
			return true;
		}
		this.setHealth(health-damage);
		return false;
	}
	
	public void setPosition(Tile tile){
		this.position=tile;
	}
	public Tile getPosition(){
		return this.position;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public int getMovement(){
		return this.movement;
	}
	
	public int getMaxHealth(){
		return this.maxHealth;
	}
	
	public int getTeam(){
		return this.team;
	}
	
	public Weapon getWeapon(){
		return this.weapon;
	}
	
	private void setHealth(int health){
		this.health=health;
	}
	
	public int getDamage(){
		return this.weapon.getDamage();
	}
	
	public ArrayList<Skill> getSkill(){
		return weapon.getSkill();
	}
	
	public int getCost(){
		return this.weapon.getCost();
	}
	
	public int getRange(){
		return this.weapon.getRange();
	}
	/**
	 * @see weapon.tryToSkill
	 */
	public boolean tryToSkill(Tile StartingTile, Tile TargetTile, int skillNumber){
		return weapon.tryToSkill(StartingTile,TargetTile, skillNumber);
	}
	/**
	 * Imprime todas las propiedades de la pieza
	 */
	public String toString(){
		return "health=" + health + " team=" + team + " weapon=" + weapon + " movement=" + movement + " maxHealth=" + maxHealth;
	}
	
	/**
	 * Ataca a la pieza ubicada en una tile
	 * @param targetTile Tile donde debe efectuarse el ataque
	 * @return true si pudo atacar a la pieza
	 * false si no habia pieza, se encuentra fuera de rango o es del mismo equipo
	 */
	public boolean attack(Tile targetTile){
		if(Game.getInstance().getPiece(targetTile)==null){
			return false;
		}
		if(Game.getInstance().getDistance(this.getPosition(),targetTile) > this.getRange()){
			return false;
		}
		if(this.getTeam() == Game.getInstance().getPiece(targetTile).getTeam()){
			return false;
		}
		Game.getInstance().getPiece(targetTile).receiveDamage(this.getDamage());
		return true;
	}
	
	/**
	 * Mueve la pieza a otra Tile.
	 * @param targetTile Tile a donde se moverá la pieza
	 * @return true si pudo mover la pieza
	 * false si la Tile está ocupada o está fuera de rango
	 */
	public boolean move(Tile targetTile){
		if(Game.getInstance().getPiece(targetTile)!=null){
			return false;
		}
		if(Game.getInstance().getDistance(this.getPosition(),targetTile) > this.getMovement()){
			return false;
		}
		Game.getInstance().removePiece(this);
		Game.getInstance().putPiece(this, targetTile);
		this.setPosition(targetTile);
		return true;
	}

}
