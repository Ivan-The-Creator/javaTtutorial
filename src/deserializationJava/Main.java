package deserializationJava;

// everything work, but the object need to be identical

import java.io.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		// 1. Declare the object (don't don't instantiate (Class name; - and don't - Class name = new Class();))
		// 2. The class should implement Serializable interface
		// 3. Add import java.io.Serializable
		// 4. FileInputStream fileOut = new FileInputStream (file path);
		// 5. ObjectInputStream in = new ObjectInputStream (fileIn);
		// 6. objectName = (Class) in.readObject();
		// 7. in.close();    fileIn.close();
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C://Users//WtF//Documents//UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();

		System.out.println(user.name);
		
	}

}
