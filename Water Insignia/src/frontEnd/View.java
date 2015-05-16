package frontEnd;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public  class View extends JFrame{
	public View(){
		JPanel panel = new MenuPanel();
		//panel.setLayout(new FlowLayout());
		setTitle("Water Insignia");
		setSize(1280,720);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		this.add(panel);
		
		
		
		
		
	}
	
}
