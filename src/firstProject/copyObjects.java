package firstProject;

public class copyObjects {
	
	public static void main(String[] args) {
		
		EnCar car1 = new EnCar ("Porsche","911",2025);
		//EnCar car2 = new EnCar ("Ford","Focus GTI",2018);
		//car2.copy(car1);
		EnCar car2 = new EnCar(car1);
				
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
	}
	
}