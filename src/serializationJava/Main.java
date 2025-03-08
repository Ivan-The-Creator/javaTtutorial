package serializationJava;

//everything work, but the object need to be identical

import java.io.*;

public class Main {
	
	// 1. Object class should implement Serializable interface ()
	// 2. add import java.io.Serializable
	// 3. FileOutputStream fileOut = new FileOutputStream(file path);
	// 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
	// 5. out.writeObject(objectName);
	// 6. out.close();    fileOut.close();

	public static void main(String[] args) throws IOException {

		User user = new User();
		
		user.name = "Johnny";
		user.password = "theStrongestPasswordEver";
		
		FileOutputStream fileOut = new FileOutputStream ("C://Users//WtF//Documents//UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved!");	
				
	}

}
