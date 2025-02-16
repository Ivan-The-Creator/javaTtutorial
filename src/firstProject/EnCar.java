package firstProject;

public class EnCar {
	
	private String make;
	private String model;
	private int year;
	
	EnCar (String make, String model, int year) {
		
		this.make = make;
		this.setModel(model);
		this.year = year;
	}
	
	public String getModel () {
		return this.model;
	}
	
	public void setModel (String newModel) {
		this.model = newModel;
	}

}
