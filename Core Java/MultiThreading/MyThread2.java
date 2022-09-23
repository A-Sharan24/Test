package multithreading;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Executing Thread : "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		MyThread2 threadMyThread = new MyThread2();
		Thread thread1 = new Thread(threadMyThread);
		thread1.setName("Thread 1");
		thread1.start();
		
		Thread thread2 = new Thread(threadMyThread);
		thread2.setName("Thread 2");
		thread2.start();
	}
}
