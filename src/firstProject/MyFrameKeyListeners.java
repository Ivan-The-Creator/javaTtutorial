package firstProject;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MyFrameKeyListeners extends JFrame implements KeyListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	JLabel label;
	
	MyFrameKeyListeners () {
		
		label = new JLabel();
		label.setBounds(0, 0, 50, 50);
		label.setBackground(Color.ORANGE);
		label.setOpaque(true);
		
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.black);
		this.addKeyListener(this);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		switch (e.getKeyChar()) {
		//break needs to pause the program otherwise it won't work correct
		case 'a': label.setLocation(label.getX()-10, label.getY());
			break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
			break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
			break;
		
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		//break needs to pause the program otherwise it won't work correct
		case 37: label.setLocation(label.getX()-10, label.getY());
			break;
		case 39: label.setLocation(label.getX()+10, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-10);
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
			break;
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		System.out.println(e.getKeyChar()+""+e.getKeyCode());
		
	}

}
