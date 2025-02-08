package firstProject;

public class oop {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		myCar2.color = "orange";
		
		System.out.println(myCar.color);
		myCar.drive();
		System.out.println(myCar.speed());
		System.out.println(myCar2.color);
		
	}
	
}