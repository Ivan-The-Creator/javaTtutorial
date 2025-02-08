package firstProject;

public class arrays {
	
	public static void main (String [] args) {
		
		String[] cars = {"Camaro","Corvette","Tesla"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[1]);
		
		// an additional way to create an array
		String[] carsSecond = new String[3];
		
		carsSecond[0] = "Pontiak";
		carsSecond[1] = "Mazda";
		carsSecond[2] = "BMW";
		
		for (int i=0; i<carsSecond.length; i++) {
		System.out.println(carsSecond[i]);
		}
		
	}
	
}