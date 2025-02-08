package firstProject;

import java.util.Scanner;

public class whileLoop {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String name = "";
		
		// 'while'loop first check the statement and than
		//executes the code
		//while (name.isBlank()) {
		//	System.out.println("Enter your name:");
		//	name = scanner.nextLine();
		//}
		
		// The variation of the 'while' loop -> 'do' loop
		// 'do' loop first executes the code and than check
		//the statement (true or false)
		do {
			System.out.print("Enter your name:");
			name = scanner.nextLine();
		} while (name.isBlank());
		
		System.out.println("Your name is: "+name);
		
		scanner.close();
		
	}
	
}