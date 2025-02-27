package firstProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrameRadioButtons extends JFrame implements ActionListener {
	
	JRadioButton button1;
	JRadioButton button2;
	JRadioButton button3;
	ButtonGroup group;
	ImageIcon appleActive = new ImageIcon ("appleSelected.png");
	ImageIcon appleUnactive = new ImageIcon ("appleUnactive.png");

	MyFrameRadioButtons () {
		
		button1 = new JRadioButton("apple");
		button2 = new JRadioButton("bananna");
		button3 = new JRadioButton("pineapple");
		
		button1.setFocusable(false);
		button1.addActionListener(this);
		button1.setIcon(appleUnactive);
		button1.setSelectedIcon(appleActive);
		button2.setFocusable(false);
		button2.addActionListener(this);
		button3.setFocusable(false);
		button3.addActionListener(this);
		
		group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.setFocusable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			System.out.println("You choose apple");
		} else if (e.getSource() == button2) {
			System.out.println("You choose bananna");
		} else if (e.getSource() == button3) {
			System.out.println("You choose pineapple");
		}
		
	}
	
}
