package firstProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrameColorChooser extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;
		
	MyFrameColorChooser () {
		
		button = new JButton("Pick a color");
		button.setFocusable(false);
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("Wazzzzzzzup");
		label.setFont(new Font("Arial",Font.BOLD,36));
		label.setOpaque(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(label);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.white);
			
			label.setForeground(color);
						
		}
		
	}

}
