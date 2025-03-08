package deserializationJava;

//everything work, but the object need to be identical

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String password;
	
	public void sayWazzup() {
		System.out.println("Wazzup "+name);
	}

}
