package threadsJava;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		System.out.println(Thread.activeCount());
		Thread.currentThread().setName("main thread");
		Thread.currentThread().setPriority(10); // 0-lowest, 10-highest
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		*/
		/*
		for (int i = 3; i>0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("Done");
		*/
		
		MyThread thread2 = new MyThread();
		thread2.setDaemon(false); // Daemon threads are low priority threads and it's terminates when all users threads finished
		thread2.start();
		//System.out.println(thread2.isAlive());
		thread2.setName("second thread");
		thread2.setPriority(1);
		System.out.println(thread2.getPriority());
		System.out.println(thread2.getName());
		System.out.println(Thread.activeCount());
		
		System.out.println(thread2.isDaemon());
	}
	
}
