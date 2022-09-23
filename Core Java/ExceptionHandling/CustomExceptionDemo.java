package exception;

public class CustomExceptionDemo {

	public static void validate(int age)throws InvalidAgeException
	{
		if(age>=18)
			System.out.println("Welcome To Vote");
		else
			throw new InvalidAgeException("Age Is Not Valid");
	}
	
	public static void main(String[] args) {
		try {
			validate(9);
		} catch(InvalidAgeException e){
		e.printStackTrace();
	}
		System.out.println("Rest Of Code");
}
}
