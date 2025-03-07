package generics;

public class Main {

	public static void main(String[] args) {
		/*
		//example
		Player player = new Player();
		Enemy enemy = new Enemy();
		Item item = new Item();
		Tree tree = new Tree();
		
		draw(player);
		draw(enemy);
		draw(item);
		draw(tree);
		*/
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'W','A','Z','Z','U','P'};
		String[] stringArray = {"Apple","Banana","Pineapple"};

		//displayArray(intArray);
		//displayArray(doubleArray);
		//displayArray(charArray);
		//displayArray(stringArray);
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
				
	}
	/*
	public static <Thing> void draw (Thing x) {
		x.draw();
	}
	*/
	
	// this is a generic method (reference data type only)
	// can be used 'T' between angle brackets (coming practice)
	public static <Thing> void displayArray (Thing[] array) {
		
		for (Thing x : array) {
			System.out.print(x+" ");
		}
		System.out.println();		
	}
	
	public static <Thing> Thing getFirst (Thing[] array) {
		return array[0];	
	}
	
}
