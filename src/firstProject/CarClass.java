package firstProject;

public class CarClass extends Vehicle {
	
	String name;
	int wheels = 4;
	int doors = 3;
	
	CarClass (String name) {
		this.name = name;
	}

	@Override
	void go() {
		
		System.out.println("The car is moving");
		
	}

}
