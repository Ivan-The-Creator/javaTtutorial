package firstProject;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel2DGraphics extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//double angle = 0;
	Image image;
	
	MyPanel2DGraphics(){
		
		this.setPreferredSize(new Dimension (500,500));
		/*
		Timer timer = new Timer (30, e -> {
			angle += Math.toRadians(1);
			repaint();
		});
		
		timer.start();
		*/
		
		image = new ImageIcon("C:\\Users\\WtF\\3D Objects\\eclipse workspace\\MyFirstJavaProject\\forDragAndDrop.jpg").getImage();
		
	}
		
	public void paint (Graphics g) {
		
			//super.paintComponent(g); //clears the panel before repainting
			
			Graphics2D g2D = (Graphics2D) g;
			
			g2D.drawImage(image, 0, 0, null);
			
			//g2D.setPaint(Color.magenta);
			//g2D.setStroke(new BasicStroke(5));
			//g2D.drawLine(0, 500, 500, 0);
			
			//g2D.drawRect(50, 50, 100, 100);
			//g2D.fillRect(200, 200, 100, 100);
			
			/*
			g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			int x = 150, y = 150, width = 150, height = 100;
			int centerX = x + width/2;
			int centerY = y + height/2;
			AffineTransform oldTransform = g2D.getTransform();
			g2D.rotate(angle,centerX,centerY);
			
			g2D.setColor(Color.orange);
			g2D.fill(new Ellipse2D.Double(x, y, width, height));
			
			g2D.setTransform(oldTransform);
			*/
			
			//g2D.drawArc(50, 50, 150, 100, 20, 160);
			//g2D.fillArc(50, 50, 100, 100, 0, 180);
			//g2D.setPaint(Color.cyan);
			//g2D.fillArc(50, 50, 100, 100, 180, 180);
			/*
			int[] xPoints = {100,200,300,250,150};
			int[] yPoints = {200,100,200,250,250};
			g2D.fillPolygon(xPoints, yPoints, 5);
			*/
			//g2D.setFont(new Font("Arial",Font.BOLD,50));
			//g2D.drawString("Wazzup", 50, 50);
			
			
	}
	
}
