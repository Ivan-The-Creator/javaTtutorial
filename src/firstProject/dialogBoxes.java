package firstProject;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dialogBoxes {
	
	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null, "Wazzup", "Greeting", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wazzup", "Greeting", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wazzup", "Greeting", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wazzup", "Greeting", JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wazzup", "Greeting", JOptionPane.INFORMATION_MESSAGE);
		
		//System.out.println(JOptionPane.showConfirmDialog(null, "Wazzup", "Greeting", JOptionPane.YES_NO_CANCEL_OPTION));
		//JOptionPane.showConfirmDialog(null, "Wazzup", "Greeting", JOptionPane.YES_NO_CANCEL_OPTION);
		//int answer = JOptionPane.showConfirmDialog(null, "Wazzup", "Greeting", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//JOptionPane.showInputDialog("WtF?");
		//String answer = JOptionPane.showInputDialog("WtF?");
		//System.out.println(answer);
		
		String[] responses = {"Wazzup, bro", "Hey", "How are you?"};
		ImageIcon icon = new ImageIcon ("C:\\Users\\WtF\\Pictures\\mae-mu-_C5zsV_p-YI-unsplash.jpg");
		JOptionPane.showOptionDialog(null, 
				"Wazzup", "Greeting", 
				JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				icon, 
				responses, 
				0);
		
	}
	
}