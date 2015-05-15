package backend;

public class Player {

	private int team;
	private int recursos;
	

	public Player(int team, int recursos){
		this.team=team;
		this.recursos=recursos;
	}
		
	public int getTeam(){
		return this.team;
	}
	public void useRecursos(int cost){
		this.recursos-=cost;
	}
	public int getRecursos(){
		return this.recursos;
	}
	
}

