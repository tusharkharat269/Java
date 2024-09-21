package exceptionHandling;

class MyException extends Exception{
	
}

public class ThrowAndThrows {


	public static int num() throws ArithmeticException {
		
//		throws used to declare type of exception method can throw
		
		return 45/0;
	}

	public static void main(String[] args) {
		
		try {
			
			throw new MyException();
			
//			num();
//			System.out.println(234 / 0); // exception occcurs which is handle by catch block
//			throw new Exception("User definedd exception caught");

		} catch (Exception e) {

//			Exception interface use to declare get type of it

//			System.out.println("exception occurs");
			System.out.println(e.getMessage()); // User definedd exception caught
			
//			for num() it print / by zero exception
//			for MyException it prints null
		
		}
		
	}

}
