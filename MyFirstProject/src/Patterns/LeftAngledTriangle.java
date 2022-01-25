package Patterns;

public class LeftAngledTriangle {
	public static void main(String args[]) {

		for (int i = 0; i <= 4; i++) {
			for (int j = 2 * (4 - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
