package firstProject;

public abstract class Vehicle {
	
	double speed;
	
	abstract void go ();
	
	void stop () {
		System.out.println("The vehicle is stopped");
	}

}
