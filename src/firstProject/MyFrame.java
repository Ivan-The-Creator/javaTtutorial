package firstProject;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame () {
		// the method of getting the image (first method I've used to change the icon)
		//Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\WtF\\Pictures\\Rubber hose\\Pencil.png");
		// alternative method (need to use image.getImage())
		ImageIcon image = new ImageIcon ("C:\\Users\\WtF\\Pictures\\Rubber hose\\Pencil.png");
		
		this.setIconImage(image.getImage()); // set icon of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		//this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // by default
		//this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // for fun (but it won't close)
		this.setResizable(false); // prevent this from being resize
		this.setTitle("The title"); // set title of the this
		this.setSize(500,500); // sets the x and y dimensions of the frame
		this.setVisible(true); // make frame visible
		//this.getContentPane().setBackground(Color.DARK_GRAY); //change the bg color 
		//this.getContentPane().setBackground(new Color (15,15,15)); //change the bg color (RGB)
		this.getContentPane().setBackground(new Color (0x0f0f0f)); //change the bg color (need to set "0x" at the beginning)
	}

}
