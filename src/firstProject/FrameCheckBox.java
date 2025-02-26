package firstProject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class FrameCheckBox extends JFrame implements ActionListener {
	
	JCheckBox checkBox;
	JButton button;
	ImageIcon icon1;
	ImageIcon icon2;
	
	FrameCheckBox () {
		
		icon1 = new ImageIcon("face1.png");
		icon2 = new ImageIcon("face2.png");
		
		checkBox = new JCheckBox();
		checkBox.setText("Are you an loco?");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Arial",Font.BOLD,20));
		checkBox.setIcon(icon1);
		checkBox.setSelectedIcon(icon2);
				
		button = new JButton("Submit");
		button.addActionListener(this);
		button.setFocusable(false);
		
		this.add(button);
		this.add(checkBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
				
		if (e.getSource() == button) {
			if (checkBox.isSelected() == true) {
				System.out.println("You are LOCO!");
			} else {
				System.out.println("Hmmm...");
			}
		}
		
	}

}
