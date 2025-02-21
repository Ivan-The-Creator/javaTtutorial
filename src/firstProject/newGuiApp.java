package firstProject;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class newGuiApp {
	
	public static void main(String[] args) {
	/*	
		// the method of getting the image (first method I've used to change the icon)
		//Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\WtF\\Pictures\\Rubber hose\\Pencil.png");
		// alternative method (need to use image.getImage())
		ImageIcon image = new ImageIcon ("C:\\Users\\WtF\\Pictures\\Rubber hose\\Pencil.png");
		
		JFrame frame = new JFrame(); // create a frame
		frame.setIconImage(image.getImage()); // set icon of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // by default
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // for fun
		frame.setResizable(false); // prevent frame from being resize
		frame.setTitle("The title"); // set title of the frame
		frame.setSize(500,500); // sets the x and y dimensions of the frame
		frame.setVisible(true); // make frame visible
		//frame.getContentPane().setBackground(Color.DARK_GRAY); //change the bg color 
		//frame.getContentPane().setBackground(new Color (15,15,15)); //change the bg color (RGB)
		frame.getContentPane().setBackground(new Color (0x0f0f0f)); //change the bg color (need to set "0x" at the beginning)
	*/	
		MyFrame myFrame = new MyFrame(); // if will need to make some changes
	
		//new MyFrame(); // in this case can't make any changes
	}
	
}