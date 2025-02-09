package firstProject;

public class Car {
	
	String make = "Ferrari";
	String model = "812 Competizione";
	int year = 2025;
	String color = "red";
	double price = 88888.00;
	
	void drive () {
		System.out.println("You drive a car.");
	}
	
	void brake () {
		System.out.println("You step on the brakes.");
	}
	
	String speed () {
		return "Current speed is 200 km/h";
	}
	
	public String toString() {
		String theString = make+"\n"+model+"\n"+color+"\n"+year;
		return theString;
	}
	
}
