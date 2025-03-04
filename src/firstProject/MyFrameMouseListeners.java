package firstProject;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MyFrameMouseListeners extends JFrame implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	JLabel label;
	Color lableColor;
	
	MyFrameMouseListeners () {
		
		label = new JLabel();
		label.setBounds(0, 0, 500, 500);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500,500);
		this.add(label);
		this.setLayout(null);
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		System.out.println("click");
		if (e.getClickCount()==2) {
			if (lableColor == Color.black) {
				lableColor = Color.white;
			} else {
				lableColor = Color.black;
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println("press");
		label.setBackground(Color.orange);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		System.out.println("release");
		label.setBackground(Color.DARK_GRAY);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		System.out.println("enter");
		lableColor = label.getBackground();
		label.setBackground(Color.DARK_GRAY);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {

		System.out.println("exit");
		label.setBackground(lableColor);
		
	}

}
