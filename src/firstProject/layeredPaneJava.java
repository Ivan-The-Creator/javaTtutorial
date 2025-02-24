package firstProject;

import java.awt.Color;

import javax.swing.*;

public class layeredPaneJava {
	
	public static void main(String[] args) {
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.cyan);
		label1.setBounds(50, 50, 200, 200);

		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.yellow);
		label2.setBounds(75, 75, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.magenta);
		label3.setBounds(100, 100, 200, 200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		//layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		//layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
		//layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(1));
		//layeredPane.setLayer(label1, 0);
		//layeredPane.setLayer(label2, 1);
		//layeredPane.setLayer(label3, 2);
		
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(layeredPane);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);
						
	}
	
}