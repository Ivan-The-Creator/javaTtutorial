package firstProject;

public class printfMethod {
	
	public static void main(String[] args) {
		
		boolean myB = true;
		char myC = '$';
		String myS = "Ivan";
		int myI = 30;
		double myD = 13.5;
		
		// conversion-character
		System.out.printf("%b This is a format string\n",myB);
		System.out.printf("%c This is a format string\n",myC);
		System.out.printf("%s This is a format string\n",myS);
		System.out.printf("%d This is a format string\n",myI);
		System.out.printf("%f This is a format string\n",myD);
		
		// width
		System.out.printf("%-10s This is a format string\n",myS);
		
		// precision
		System.out.printf("%.2f This is a format string\n",myD);
		
		// flags
		System.out.printf("%,f This is a format string\n",myD);
		
	}
	
}