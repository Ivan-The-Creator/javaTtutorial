package animationDemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HIGHT = 500;
	Timer timer;
	int xVelocity = 3, yVelocity = 2;
	int x = 0, y = 0;
	
	MyPanel () {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HIGHT));
		this.setBackground(Color.black);
				
		timer = new Timer(15, this);
		timer.start();
		
	}
	
	public void paint (Graphics g) {
		
		super.paint(g); // if there is a need to set a bg color
		
		Graphics2D g2D = (Graphics2D) g;
						
		g2D.setPaint(Color.orange);
		g2D.fillRect(x, y, 50, 50);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// in case with image if (x >= PANEL_WIDTH-image.getWidth(null)) { operation }
		if (x >= 450 || x < 0) {
			xVelocity = xVelocity * -1;
		}
		
		if (y >= 450 || y < 0) {
			yVelocity = yVelocity * -1;
		}
		
		x = x + xVelocity;
		y = y + yVelocity;
		repaint();
		
	}

}
