package frontEnd;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public  class MatchView extends JFrame{
	
	private MenuPanel panel;
	
	public MatchView(){
		
		setTitle("Water Insignia");
		setSize(1280,720);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		panel = new MenuPanel();
		this.add(panel);
		
		
		
		
		
	}

	public MenuPanel getPanel() {
		return this.panel;
	}
	
}
