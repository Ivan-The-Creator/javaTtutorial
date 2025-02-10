package firstProject;

public class staticKeywordModifier {
	
	public static void main(String[] args) {
		
		Friend friend1 = new Friend("Bart");
		Friend friend2 = new Friend("Bob");
		Friend friend3 = new Friend("Ross");
		
		System.out.println(Friend.numberOffFriends);
		Friend.displayNumberOffFriends();
		
	}
	
}