package firstProject;

public class toStringMethod {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);
		System.out.println();
		// can call toString method
		System.out.println(car.toString());
		System.out.println();
		// or it'll call automatically
		System.out.println(car);	
		
	}
	
}