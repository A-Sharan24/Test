package exception;

public class FinallyEx {

	public static void main(String[] args) {
		
		System.out.println("Case 1 : Where Exception Doesn't Occur");
		try {
			String s = "Finally Demo";
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();		}
		finally {
			System.out.println("Case 1 : It Is Always Executed");
		}
		
		System.out.println("Case 1 : Rest Of Code");
		
		System.out.println("\nCase 2 : Where Exception Occurs And Handled");
		try {
			String str = "abc";
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			e.printStackTrace();		}
		finally {
			System.out.println("Case 2 : It Is Always Executed");
		}
		
		System.out.println("Case 2 : Rest Of Code");
		
		System.out.println("\nCase 3 : Where Exception Occurs But Does Not Handled");
		try {
			int a = 10/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			e.printStackTrace();		}
		finally {
			System.out.println("Case 3 : It Is Always Executed");
			
		}
		System.out.println("Case 3 : Rest Of Code");
	}
	
}
