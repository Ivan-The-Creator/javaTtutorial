package firstProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MyFrameMenuBar extends JFrame implements ActionListener {

	JMenuBar menuBar = new JMenuBar(); // need to set on frame
	
	JMenu file = new JMenu("File");
	JMenuItem fNew = new JMenuItem("New");
	JMenuItem fOpen = new JMenuItem("Open");
	JMenuItem fClose = new JMenuItem("Close");
	
	//also there is a possibility to create and set Icon to each menu item
	//as always need to use IconImage and then .setIcon method
	
	JMenu edit = new JMenu("Edit");
	JMenu source = new JMenu("Source");
	
	JPanel panel;
	
	MyFrameMenuBar () {
		
		panel = new JPanel();
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(source);
		
		file.add(fNew);
		fNew.addActionListener(this);
		fNew.setMnemonic(KeyEvent.VK_N); // the other way to set shortcuts (need to focus the main menu)
		file.add(fOpen);
		fOpen.addActionListener(this);
		fOpen.setMnemonic(KeyEvent.VK_O); // the other way to set shortcuts (need to focus the main menu)
		file.add(fClose);
		fClose.addActionListener(this);
		fClose.setMnemonic(KeyEvent.VK_X); // the other way to set shortcuts (need to focus the main menu)
		file.setMnemonic(KeyEvent.VK_F); // need to hold alt and then press the key
		edit.setMnemonic(KeyEvent.VK_G); // need to hold alt and then press the key
		source.setMnemonic(KeyEvent.VK_H); // need to hold alt and then press the key
		
		this.add(panel);
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		setShortCuts ();
		
	}
	
	public void setShortCuts () {
		
		addShortcut ("shift A", "shiftA_Pressed");
		addShortcut ("shift S", "shiftS_Pressed");
		addShortcut ("shift E", "shiftE_Pressed");
				
	}
	
	public void addShortcut (String keyStrokeStr, String actionName) {
		KeyStroke keyStroke = KeyStroke.getKeyStroke(keyStrokeStr);
		InputMap inputMap = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = panel.getActionMap();
		inputMap.put(keyStroke, actionName);
		actionMap.put(actionName, new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (actionName.equals("shiftA_Pressed")) {
					System.out.println("New file was created");
				}
				
				if (actionName.equals("shiftS_Pressed")) {
					System.out.println("The file was opened");
				}
				
				if (actionName.equals("shiftE_Pressed")) {
					System.exit(0);
				}
				
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==fNew) {
			System.out.println("New file was created");
		}
		
		if (e.getSource()==fOpen) {
			System.out.println("The file was opened");
		}
		
		if (e.getSource()==fClose) {
			System.exit(0);
		}
		
	}
	
}
