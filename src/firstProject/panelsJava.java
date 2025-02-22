package firstProject;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class panelsJava {
	
	public static void main(String[] args) {
		
		JLabel label = new JLabel();
		label.setText("Wazzup");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel blackPanel = new JPanel();
		blackPanel.setBackground(Color.black);
		blackPanel.setBounds(0, 0, 100, 100);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.yellow);
		yellowPanel.setBounds(100, 0, 100, 100);
		
		JPanel magentaPanel = new JPanel();
		magentaPanel.setBackground(Color.magenta);
		magentaPanel.setBounds(0, 100, 200, 100);
		magentaPanel.setLayout(new BorderLayout());
		magentaPanel.add(label);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.add(blackPanel);
		frame.add(yellowPanel);
		frame.add(magentaPanel);
		
	}
	
}