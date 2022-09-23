package multithreading;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		
		while (true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Executing Thread : "+getName());
		}
	}
	
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.setName("Thread 1");
		thread1.start();
		
		MyThread1 thread2 = new MyThread1();
		thread2.setName("Thread 2");
		thread2.start();
		
		System.out.println("Hello");
	}
}
