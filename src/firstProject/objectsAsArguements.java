package firstProject;

public class objectsAsArguements {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		CarClass car = new CarClass("Ferarry");
		CarClass car2 = new CarClass("Tesla");
		
		garage.park(car);
		garage.park(car2);
		
	}
	
}