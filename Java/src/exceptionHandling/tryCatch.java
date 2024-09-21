package exceptionHandling;

public class tryCatch {

	public static void main(String[] args) {

//		System.out.println(534/0);
//						Exception in thread "main" java.lang.ArithmeticException: / by zero
//								at Java/exceptionHandling.tryCatch.main(tryCatch.java:7)

		try {

			System.out.println(234 / 0); // exception occcurs which is handle by catch block

		} catch (Exception e) {

//			Exception interface use to declare get type of it

			System.out.println("exception occurs");
			System.out.println(e.getMessage()); // / by zero
		}

		System.out.println("Remaining code is running...");
	}

}
