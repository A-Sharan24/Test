package multithreading;

class Customer {
	private int amount = 10000; 
		
   synchronized void withdraw (int amount) {
	   System.out.println("Going To Withdraw");
	   if(this.amount<amount)
	   {
		   System.out.println("Less Balance... Waiting For Deposit");
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   this.amount+=amount;
	   System.out.println("Withdraw Completes");
   }
   synchronized void deposit (int amount)
   {
	   System.out.println("Going To Deposit Rs."+amount);
	   this.amount+=amount;
	   System.out.println("Deposit Completes. Balance : Rs."+this.amount);
	   notify();
   }
}


public class InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		new Thread("Raj") {
			public void run() {customer.withdraw(15000);};
		}.start();
		
		new Thread("Manas") {
			public void run() {customer.deposit(10000);};
		}.start();
	}

}
