package firstProject;
import java.util.*;

public class multiArrayLists {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> totalList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("bread");
		bakeryList.add("butter");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("apples");
		produceList.add("oranges");
		produceList.add("bananas");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("water");
		drinkList.add("milk");
		
		totalList.add(bakeryList);
		totalList.add(produceList);
		totalList.add(drinkList);
		
		System.out.println(bakeryList);
		System.out.println(produceList);
		System.out.println(drinkList);
		System.out.println(totalList);
		System.out.println(totalList.get(0));
		System.out.println(totalList.get(0).get(2));
		
	}
	
}