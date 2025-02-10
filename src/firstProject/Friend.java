package firstProject;

public class Friend {
	
	String name;
	static int numberOffFriends;
	
	Friend (String name) {
		this.name = name;
		numberOffFriends++;
	}
	
	static void displayNumberOffFriends () {
		System.out.println(numberOffFriends);
	}

}
