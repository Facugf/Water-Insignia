package testers;

import javax.swing.JFrame;

public class TestJugador extends JFrame {

	public TestJugador(){
		setTitle("Water Insignia");
		setSize(500,500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	
	
	public static void main(String[] args) {
		new TestJugador();
	}
	
}
