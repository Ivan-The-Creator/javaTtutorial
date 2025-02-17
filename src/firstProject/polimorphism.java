package firstProject;

public class polimorphism {
	
	public static void main(String[] args) {
		
		//if there is a need to store different objects in an array, it needs to
		//understand what these objects have in common and based on it create an array.
		
		CarClass car = new CarClass("Porsche");
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		//or it could be write like:
		//Object[] racers = {car,bicycle,boat};
		//for (Object x : racers) {
		//	((Bicycle)x).go();
		//}
		
		for (Vehicle x : racers) {
			x.go();
		}
		
	}
	
}