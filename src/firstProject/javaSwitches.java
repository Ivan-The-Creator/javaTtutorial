package firstProject;

public class javaSwitches {
	
	public static void main (String[] args) {
		
		String day = "Wow";
		
		switch (day) {
			// break needs to pause the program
			case "Sunday": System.out.println("It's Sunday");
			break;
			case "Monday": System.out.println("It's Monday");
			break;
			case "Tuesday": System.out.println("It's Tuesday");
			break;
			case "Wednesday": System.out.println("It's Wednesday");
			break;
			case "Tursday": System.out.println("It's Tursday");
			break;
			case "Friday": System.out.println("It's Friday");
			break;
			case "Saturday": System.out.println("It's Saturday");
			break;
			default: System.out.println("That's not a day");
		
		}
		
	}
	
}