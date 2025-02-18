package firstProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriters {
	
	public static void main(String[] args) {
		
		File file = new File("text.txt");
		
		if (file.exists()) {
			System.out.println("This file alredy exist");
		} else {
		try {
			file.createNewFile();
			if (file.exists()) {
				System.out.println("file created");
				System.out.println(file.getAbsolutePath());
			} else {
				System.out.println("file doesn't created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		try {
			FileWriter writer = new FileWriter("text.txt");
			writer.write("The first text \nThe second string \nAnd third");
			writer.append("\nthis will add a message at the end of the file");
			//the FileWriter have to be closed when the work with it is done
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}