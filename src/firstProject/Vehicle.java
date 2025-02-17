package firstProject;

public abstract class Vehicle {
	
	double speed;
	
	abstract public void go ();
	
	void stop () {
		System.out.println("The vehicle is stopped");
	}

}
