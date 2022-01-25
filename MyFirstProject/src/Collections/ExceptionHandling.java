package Collections;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("sjdbasf");
		ExceptionHandling.main("shchb");
		int n = 0;
		try {
			if(false) {
				throw new ArithmeticException("age less then 9");

			}
			else {
				System.out.println("age more then 9");
			}
			double quotient = 234 / n;

			System.out.println("Quotient: " + quotient);

			
		} 
		catch(ArithmeticException e) {
		      System.out.println(e.getMessage());
		      
		    }
		System.out.println("program runs");

	}

	public static void main(String args) {
		System.out.println(args);
	}

}
