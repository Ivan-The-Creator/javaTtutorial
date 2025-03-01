package firstProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(); // can pass the min and max value
	Timer timer;
	
	ProgressBarDemo () {
		
		bar.setValue(0);
		bar.setBounds(25, 100, 400, 100);
		bar.setStringPainted(true); // shows a text progress
		bar.setFont(new Font("Arial",Font.BOLD,20));
		bar.setForeground(Color.orange); // change the bar color
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	}

	public void fill () {
		/*
		// an option
		int count = 0;
		
		while (count <= 100) {
			bar.setValue(count);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			count+=1;
		}
		*/
		
		 // correct way
		timer = new Timer(50, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(bar.getValue() < 100) {
					bar.setValue(bar.getValue()+1);
				} else {
					timer.stop();
					bar.setString("Done!");
				}
				
		}});
		
		timer.start();
		
		
	}
	
}
