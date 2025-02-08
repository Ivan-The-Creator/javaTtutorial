package firstProject;
import javax.swing.JOptionPane;

public class guiApp {
	
	public static void main (String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Wazzup "+name+"!");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Cool! You're "+age+"years old!");
		
		double hight = Double.parseDouble(JOptionPane.showInputDialog("Enter your hight"));
		JOptionPane.showMessageDialog(null, "Wow! You're "+hight+"cm tall!");
		
	}
	
}