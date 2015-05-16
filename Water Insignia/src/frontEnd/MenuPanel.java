package frontEnd;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;


public class MenuPanel extends JPanel{
	
	private JButton w1Button;
	private JButton w2Button;
	private JButton w3Button;
	private JButton upButton;
	private JButton downButton;
	private JButton leftButton;
	private JButton rightButton;
	
	public MenuPanel(){
		setLayout(null);
		setSize(1280, 720);
		Dimension size = getSize();
		
		w1Button = new JButton("W1");
		w1Button.setBounds(size.width/2 - 290, 1, 180, 90);
		w2Button = new JButton("W2");
		w2Button.setBounds(size.width/2 - 90, 1, 180, 90);
		w3Button = new JButton("W3");
		w3Button.setBounds(size.width/2 + 110, 1, 180, 90);
		
		this.add(w1Button);
		this.add(w2Button);
		this.add(w3Button);
		
		upButton = new JButton("UP");
		upButton.setBounds(size.width/2 - 400, 91, 180, 90);
		downButton = new JButton("DOWN");
		downButton.setBounds(size.width/2 - 200, 91, 180, 90);
		leftButton = new JButton("LEFT");
		leftButton.setBounds(size.width/2 , 91, 180, 90);
		rightButton = new JButton("RIGHT");
		rightButton.setBounds(size.width/2 + 200, 91, 180, 90);
		
		this.add(upButton);
		this.add(downButton);
		this.add(leftButton);
		this.add(rightButton);
		
		
		}
	void addW1Listener(ActionListener warrior1Listener){
		
		w1Button.addActionListener(warrior1Listener);	
	}
	
	void addDownListener(ActionListener downListener){
		downButton.addActionListener(downListener);
	}
	
	void addUpListener(ActionListener upListener){
		upButton.addActionListener(upListener);
	}
	
	void addLeftListener(ActionListener leftListener){
		leftButton.addActionListener(leftListener);
	}
	
	void addRightListener(ActionListener rightListener){
		rightButton.addActionListener(rightListener);
	}
		
	
	
	
}
