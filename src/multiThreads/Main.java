package multiThreads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// threads can run independently, even if one of it
		// causes an exception (error)
		
		MyThread thread1 = new MyThread();
		
		MyRunnable runnable1 = new MyRunnable(); // more useful method
		Thread thread2 = new Thread(runnable1);
		
		thread1.start();
		thread1.join(1000); // calling  thread (example main) wait until
							// specified thread dies (finish) or for
							// x milliseconds
		thread2.start();

	}

}
