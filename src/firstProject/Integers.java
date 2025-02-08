package firstProject;

public class Integers {

	public static void main (String[] args) {
		
		int x; //declaration
		
		x = 123;
		
		int y = 456;
		long z = 1322165465616548L;
		double r = 3.14526;
		boolean e = true;
		char symbol = '@'; // can contains any character (just one)
		String name = "Ivan"; 
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("The first number is:"+x);
		System.out.println(z);
		System.out.println(r);
		System.out.println(e);
		System.out.println(symbol);
		System.out.println(name);
		
		// Bonus 'How to switch two integers'
		
		String first = "water";
		String second = "honey";
		String third; // in video the name 'temp'
		
		System.out.println("first: "+first);
		System.out.println("second: "+second);
		
		third = first;
		first = second;
		second = third;
		
		System.out.println("first: "+first);
		System.out.println("second: "+second);
		
		
		
		
	}

}
