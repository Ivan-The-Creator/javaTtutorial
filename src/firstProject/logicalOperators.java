package firstProject;
import java.util.Scanner;

public class logicalOperators {
	
	public static void main (String[] args) {
		
		int temp = 19;
		
		if (temp >=30) {
			System.out.println("It's hot outside");
		} else if (temp >=20 && temp <=30) {
			System.out.println("It's worm outsile");
		} else {
			System.out.println("It's cold outside");
		}
		
		Scanner scanner = new Scanner (System.in);
		
		//System.out.println("Press 'q' to quit");
		//String response = scanner.next();
		//if (response.equals("q") || response.equals("Q")) {
		//	System.out.println("You're quit the game");
		//} else {
		//	System.out.println("Wrong key. Try againq");
		//}
		
		System.out.println("Press 'q' to quit");
		String response = scanner.next();
		if (!response.equals("q") && !response.equals("Q")) {
			System.out.println("Wrong key. Try againq");
		} else {
			System.out.println("You're quit the game");
		}
		
		scanner.close();
		
	}
	
}