package generics;

public class MyGenericClass <Thing extends Number, Thing2> {
	
	Thing x;
	Thing2 y;
	
	MyGenericClass(Thing x, Thing2 y){
		this.x = x;
		this.y = y;
	}
	
	public Thing getX(){
		return x;
	}
	
	public Thing2 getY(){
		return y;
	}

}
