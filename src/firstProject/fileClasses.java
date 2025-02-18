package firstProject;

import java.io.File;

public class fileClasses {
	
	public static void main(String[] args) {
		
		File file = new File("C:/Users/WtF/3D Objects/eclipse workspace/MyFirstJavaProject/src/firstProject/secretMessage.txt");
		
		if (file.exists()) {
			System.out.println("This file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			//to check if is it a file and not a folder
			System.out.println(file.isFile());
			file.delete();
		} else {
			System.out.println("This file doesn't exist");
		}
		
	}
	
}