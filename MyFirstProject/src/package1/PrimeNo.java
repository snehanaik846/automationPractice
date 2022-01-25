package package1;

import java.util.Scanner;

public class PrimeNo {

	public static String primeno(int n) {
		if (n < 0) {
			return "give valid number";
		}
		if (n == 0 || n == 1) {
			return "0 and 1 is not prime";
		}

		if (n == 2 || n == 3) {
			return "prime";
		}
		if ((n * n - 1) % 24 == 0) {
			return "Prime";
		} else {
			return "not prime";
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println(primeno(number));
	}

}
