package firstProject;

import java.util.ArrayList;

public class arrayLists {
	
	public static void main(String[] args) {
		
		//ArrayList can contain only a reference data type: Integer, Double, Boolean, String etc.
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("chicken");
		food.add("hotdog");
		
		food.set(0, "apple");
		food.remove(2);
		food.clear();
		
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
	}
	
}