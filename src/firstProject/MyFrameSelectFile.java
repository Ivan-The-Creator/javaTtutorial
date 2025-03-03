package firstProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class MyFrameSelectFile extends JFrame implements ActionListener {
	
	JButton button = new JButton("Select the file");
	JFileChooser fileChooser = new JFileChooser();
	File file;

	MyFrameSelectFile () {
		
		fileChooser.setCurrentDirectory(new File("C://"));
		
		button.addActionListener(this);
		button.setFocusable(false);
		
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
			//int response = fileChooser.showOpenDialog(null); // select file to open
			int response = fileChooser.showSaveDialog(null); //select file to save
			
			if (response == JFileChooser.APPROVE_OPTION) {
				file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
		
	}
	
}
