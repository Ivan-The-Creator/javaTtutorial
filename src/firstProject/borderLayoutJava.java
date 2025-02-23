package firstProject;

import java.awt.*;

import javax.swing.*;

public class borderLayoutJava {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		
		panel5.setLayout(new BorderLayout(1,1));
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		
		panel1.setBackground(Color.black);
		panel2.setBackground(Color.cyan);
		panel3.setBackground(Color.magenta);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.red);
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.black);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		panel6.setPreferredSize(new Dimension(25,25));
		panel7.setPreferredSize(new Dimension(25,25));
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.EAST);
		frame.add(panel3,BorderLayout.WEST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		
	}
	
}