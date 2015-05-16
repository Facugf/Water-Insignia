package frontEnd;

import frontEnd.Match.AL;

public class Main {
	
	public static void main(String[] args) {
		View d=new View();
		Match match = new Match(8,8,10,2);
		AL keyL1=match.new AL();
		d.addKeyListener(keyL1);
		}
}
