package frontEnd;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import backend.game.Game;
import backend.piece.Warrior;
import backend.weapons.warriorweapon.ShortSword;


public class MenuPanel extends JPanel{
	
	private Match matchUI = new Match(8,8,10,2);
	public MenuPanel(){
		setLayout(null);
		setSize(1280, 720);
		Dimension size = getSize();
		JButton w1Button = new JButton("W1");
		w1Button.setBounds(size.width/2 - 290, 1, 180, 90);
		JButton w2Button = new JButton("W2");
		w2Button.setBounds(size.width/2 - 90, 1, 180, 90);
		JButton w3Button = new JButton("W3");
		w3Button.setBounds(size.width/2 + 110, 1, 180, 90);
		this.add(w1Button);
		this.add(w2Button);
		this.add(w3Button);
		
		w1Button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				matchUI.deployPiece(new Warrior(matchUI.getPlayerTurn(), new ShortSword()));
			}
		});
		
	}
	
	
}
