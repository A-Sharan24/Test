package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int c =10/0;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest Of The Code ");
	}

}
