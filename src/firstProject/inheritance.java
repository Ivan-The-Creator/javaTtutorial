package firstProject;

public class inheritance {
	
	public static void main(String[] args) {
		
		CarClass car = new CarClass("Tesla");
		System.out.println(car.name);
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		System.out.println();
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		
		
	}
	
}