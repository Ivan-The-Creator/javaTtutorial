package threadsJava;

public class MyThread extends Thread {
	
	@Override
	public void run () {
		
		if (this.isDaemon()) {
			System.out.println("The thread is daemon");
		} else {
			System.out.println("The thread is user");
		}
	}

}
