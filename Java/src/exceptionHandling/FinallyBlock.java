package exceptionHandling;

public class FinallyBlock {
	
	
	public static void main(String[] args) {
		
		try {

			System.out.println(234 / 0);
//			System.out.println(2/2);

		} catch (Exception e) {


			System.out.println("exception occurs");
			System.out.println(e.getMessage()); // / by zero
		}
		
//		blocks get always executes whether exception occurs or not 
		finally {
			System.out.println("alwayas executesss......");
		}
	}

}
