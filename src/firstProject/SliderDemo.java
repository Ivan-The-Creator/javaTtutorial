package firstProject;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo () {
		
		frame = new JFrame("Slider demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); //the third value is a starting point

		slider.setPreferredSize(new Dimension(50,500));
		slider.setOrientation(JSlider.VERTICAL);
		//slider.setOrientation(SwingConstants.VERTICAL);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(25);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);
				
		label.setText("Current temperature: "+slider.getValue()+"*C");
		label.setOpaque(true);
		
		panel.add(slider);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("Current temperature: "+slider.getValue()+"*C");
		
	}

}
