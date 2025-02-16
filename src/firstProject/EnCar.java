package firstProject;

public class EnCar {
	
	private String make;
	private String model;
	private int year;
	
	EnCar (String make, String model, int year) {
		
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	EnCar (EnCar x) {
		this.copy(x);
	}
	
	public String getMake () {
		return this.make;
	}
	
	public String getModel () {
		return this.model;
	}
	
	public int getYear () {
		return this.year;
	}
	
	public void setMake (String newMake) {
		this.make = newMake;
	}
	
	public void setModel (String newModel) {
		this.model = newModel;
	}
	
	public void setYear (int newYear) {
		this.year = newYear;
	}
	
	public void copy (EnCar x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}

}
