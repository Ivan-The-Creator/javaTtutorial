package firstProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class labelsJava {
	
	public static void main(String[] args) {
		// resize and set the icon
		ImageIcon image = new ImageIcon("C:\\Users\\WtF\\Pictures\\Rubber hose\\Pencil.png");
		Image originalImage = image.getImage();
		Image resizedImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(resizedImage);
		
		Border border = BorderFactory.createLineBorder(Color.black, 20); // create a border
		
		JLabel label = new JLabel(); // create a label
		label.setIcon(icon); // set icon
		label.setText("Wazzup man!"); // set text of label
		label.setFont(new Font ("Arial",Font.BOLD,36)); //change a font
		label.setForeground(Color.white); // change the text color
		label.setHorizontalTextPosition(JLabel.CENTER);	// set horizontal text position
		label.setVerticalTextPosition(JLabel.TOP); // set vertical text position
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setIconTextGap(10); // set a gap between a text and an icon
		label.setBackground(new Color (45,124,96)); // set the bg color of the label
		label.setOpaque(true); // set the visibility of the bg
		label.setBorder(border); // set a border
		//label.setBounds(50, 50, 350, 350); // set the label position on the canvas/frame
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null); // change the way of label management to manual
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.add(label);
		// also need to add all components before using the pack() method
		frame.pack(); // it'll resize the frame to accommodate all components
		
	}
	
}