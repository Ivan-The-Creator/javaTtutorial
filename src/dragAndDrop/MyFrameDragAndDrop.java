package dragAndDrop;

import javax.swing.JFrame;

public class MyFrameDragAndDrop extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	
	DragPanel dragPenel = new DragPanel();

	MyFrameDragAndDrop () {
		
		this.add(dragPenel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
		
	}

}
