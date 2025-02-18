package firstProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		try {
						
			System.out.println("Enter a whole number to divide:");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by:");
			int y = scanner.nextInt();
			
			int z = x/y;
			System.out.println("result: "+z);
		} 
		catch (ArithmeticException e) {
			System.out.println("You can't divide by \"0\"");
		} 
		catch (InputMismatchException e) {
			System.out.println("Wrong data");
		}
		//it could be used:
		//catch (Exception e) {
		//	System.out.println("something went wrong");
		//}
		//but it'll catch all exceptions. it's better to specify it
		finally {
			//System.out.println("this is always print");
			// it useful to do something like close the scanner
			// in this block (the scanner needs to be outside
			// of the try block)
			scanner.close();
		}
	}
	
}