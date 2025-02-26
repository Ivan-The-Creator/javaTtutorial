package firstProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.accessibility.AccessibleContext;
import javax.swing.*;

public class MyFrameText extends JFrame implements ActionListener{
	
	JTextField textField = new JTextField();
	JButton button = new JButton("Submit");

	MyFrameText () {
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(300,30));
		textField.setFont(new Font("Serif", Font.BOLD,18));
		textField.setText("Enter your text");
		textField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().isEmpty()) {
					textField.setText("Enter your text");
					textField.setForeground(Color.gray);
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("Enter your text")) {
					textField.setText("");
					textField.setForeground(Color.black);
					
				}
				
			}
		});
		
		button.addActionListener(this);
		this.add(textField);
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack(); // this is make a frame to adjust the components in it
		this.setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == button) {
			String response = textField.getText();
			textField.setText("Enter your text");
			textField.setForeground(Color.gray);
			System.out.println(response);
		}
	}
			
}
