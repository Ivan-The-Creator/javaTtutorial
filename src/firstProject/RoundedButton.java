package firstProject;

import java.awt.*;

import javax.swing.*;

public class RoundedButton extends JButton {
	
	private int cornerRadius;
	
	RoundedButton () {
		super();
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.setBorderPainted(false);
		
	}
	
	@Override
	protected void paintComponent (Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setColor(getBackground());
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
		
		super.paintComponent(g);
		g2.dispose();
	}
	
	@Override
	protected void paintBorder (Graphics g) {
		
	}
	
	public void setCornerRadius (int x) {
		cornerRadius = x;
	}

}
