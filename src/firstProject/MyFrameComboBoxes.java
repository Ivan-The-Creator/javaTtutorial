package firstProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrameComboBoxes extends JFrame implements ActionListener {
	
	//in the combo box need to pass the reference data type only (String, Integer, Double, Boolean, Character)
	
	JComboBox comboBox;

	MyFrameComboBoxes () {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"panter","tiger","elephant","jaguar"};
		
		comboBox = new JComboBox(animals);
		//comboBox.addItem(animals[0]);
		//comboBox.addItem(animals[1]);
		//comboBox.addItem(animals[2]);
		//comboBox.addItem(animals[3]);
		//comboBox.addItem("snake");
		comboBox.addActionListener(this);
		//comboBox.setEditable(true); // allows to type in the combo box
		//System.out.println(comboBox.getItemCount()); // returns the sum number of the element
		comboBox.insertItemAt("eagle", 0); // put the element on the specific position
		comboBox.setSelectedIndex(0);
		
		
		this.add(comboBox);
		this.setSize(200, 200);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==comboBox) {
			//System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		}
		
	}
	
}
