package firstProject;

public class encapsulation {
	
	public static void main(String[] args) {
		
		EnCar car = new EnCar("Porsche","911",2025);
		
		System.out.println(car.getModel());
		car.setModel("Panamera");
		System.out.println(car.getModel());
		
	}
		
}