package firstProject;

public class oopSecond {
	
	public static void main(String[] args) {
						
		Human human = new Human("Ivan",31,61);
		System.out.println(human.name);
		human.eat();
		
		Human human2 = new Human("Rob",29,60);
		System.out.println(human2.name);
		human2.drink();
	}
		
}