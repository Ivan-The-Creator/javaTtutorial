package firstProject;

public class stringMethods {
	
	public static void main (String[] args) {
		
		String name = " Ivan";
		
		//boolean result = name.equals("Ivan");
		//boolean resultSec = name.equalsIgnoreCase("ivan");
		//System.out.println(result);
		//System.out.println(resultSec);
		
		//int result = name.length();
		//char result = name.charAt(1);
		//int result = name.indexOf("a");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim();
		String result = name.replace("v", "b");
		
		
		System.out.println(result);
		
	}
	
}