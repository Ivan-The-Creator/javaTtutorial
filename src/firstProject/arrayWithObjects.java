package firstProject;

public class arrayWithObjects {
	
	public static void main(String[] args) {
		
		//Food[] refrigerator = new Food[3];
		
		Food prod1 = new Food ("kiwi");
		Food prod2 = new Food ("mango");
		Food prod3 = new Food ("bananas");
		
		Food[] refrigerator = {prod1,prod2,prod3};
				
		//refrigerator[0] = prod1;
		//refrigerator[1]	= prod2;
		//refrigerator[2]	= prod3;
		
		System.out.println(refrigerator[0].name);
				
	}
	
}