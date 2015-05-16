package frontEnd;



public class Main {
	
	public static void main(String[] args) {
		MatchView matchview=new MatchView();
		MatchModel matchmodel = new MatchModel(8,8,10,2);
		MatchController matchcontroller = new MatchController(matchmodel,matchview);
		//AL keyL1=match.new AL();
		//d.addKeyListener(keyL1);
		}
}
