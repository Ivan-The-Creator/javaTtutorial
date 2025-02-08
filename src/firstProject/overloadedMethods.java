package firstProject;

public class overloadedMethods {
	
	public static void main(String[] args) {
		
		double x = add(1.3,2.5);
		System.out.println(x);
		
	}
	
	static int add (int a, int b) {
		System.out.println("method #1");
		return a+b;
	}
	
	static int add (int a, int b, int c) {
		System.out.println("method #2");
		return a+b+c;
	}
	
	static int add (int a, int b, int c, int d) {
		System.out.println("method #3");
		return a+b+c+d;
	}
	
	static double add (double a, double b) {
		System.out.println("method #4");
		return a+b;
	}
	
	static double add (double a, double b, double c) {
		System.out.println("method #5");
		return a+b+c;
	}
	
	static double add (double a, double b, double c, double d) {
		System.out.println("method #6");
		return a+b+c+d;
	}
	
}