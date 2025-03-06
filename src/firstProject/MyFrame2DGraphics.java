package firstProject;

import java.awt.*;

import javax.swing.*;

public class MyFrame2DGraphics extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MyPanel2DGraphics panel;
	
	MyFrame2DGraphics(){
		
		panel = new MyPanel2DGraphics();
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); // the order (position of the line) matter
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
}
