package generics;

public class MainGenericClasses {

	public static void main(String[] args) {
		/*
		MyIntegetClass myInt = new MyIntegetClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(2.2);
		MyCharacterClass myChar = new MyCharacterClass('$');
		MyStringClass mySrting = new MyStringClass("Wazzup");
		
		System.out.println(myInt.getX());
		System.out.println(myDouble.getX());
		System.out.println(myChar.getX());
		System.out.println(mySrting.getX());
		*/
		
		MyGenericClass<Integer,String> myInt = new MyGenericClass<>(1,"Wazzup");
		MyGenericClass<Double,Character> myDouble = new MyGenericClass<>(2.2,'$');
		//MyGenericClass<Character,Double> myChar = new MyGenericClass<>('$',8.7);
		//MyGenericClass<String,Integer> mySrting = new MyGenericClass<>("Wazzup",78);
		
		System.out.println(myInt.getX()+" "+myInt.getY());
		System.out.println(myDouble.getX()+" "+myDouble.getY());
		//System.out.println(myChar.getX()+" "+myChar.getY());
		//System.out.println(mySrting.getX()+" "+mySrting.getY());
	}

}
