package firstProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class MyFrameTwo extends JFrame implements ActionListener {
	
	JButton button;
	RoundedButton buttonTwo;
	
	JLabel label;
	ImageIcon image = new ImageIcon("C:\\Users\\WtF\\Pictures\\mae-mu-_C5zsV_p-YI-unsplash.jpg");
	
	MyFrameTwo () {
		
		label = new JLabel();
		label.setIcon(image);
		label.setVisible(false);
		label.setBounds(0, 0, 500, 500);
		
		button = new JButton();
		button.setBounds(200, 100, 200, 100);
		button.addActionListener(this);
		// or there is a shortcut (no need method and implements) (there is a video)
		// button.addActionListener(e -> System.out.println("click"));
		button.setBackground(Color.DARK_GRAY);
		button.setText("CLICK");
		button.setFont(new Font("Arial",Font.BOLD,30));
		button.setFocusable(false);
		button.setForeground(Color.white);
		button.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		//button.setEnabled(false);
		
		buttonTwo = new RoundedButton();
		buttonTwo.setText("CLICK");
		buttonTwo.setFont(new Font("Arial",Font.BOLD,30));
		buttonTwo.setBackground(new Color (135,200,95));
		buttonTwo.setForeground(Color.black);
		buttonTwo.setBounds(200, 200, 200, 100);
		buttonTwo.setCornerRadius(20);
		buttonTwo.addActionListener(e -> System.out.println("Click two"));
		buttonTwo.addMouseListener(new MouseAdapter () {
			
			@Override
			public void mousePressed (MouseEvent e) {
				buttonTwo.setBackground(Color.black);
				buttonTwo.setForeground(Color.white);
			}
			
			@Override
			public void mouseReleased (MouseEvent e) {
				buttonTwo.setBackground(new Color (135,200,95));
				buttonTwo.setForeground(Color.black);
			}
									
		});
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(buttonTwo);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("click");
			//if there is a need to use the button only one time
			// need to put setEnable in this method
			button.setEnabled(false);
			label.setVisible(true);
		}
		
	}

}
