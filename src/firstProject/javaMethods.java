package firstProject;

public class javaMethods {
	
	public static void main(String[] args) {
		
		String name = "Ivan";
		int age = 31;
		
		hello(name,age);
		
	}
	
	static void hello (String message, int number) {
		System.out.println("Hello "+message);
		System.out.println("You are "+number+" years old");
	}
	
}