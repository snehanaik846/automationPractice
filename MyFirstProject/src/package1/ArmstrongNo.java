package package1;

public class ArmstrongNo {
	public static boolean checkarmstrongNo(int n) {
		int sum = 0;
		int rem = 0;
		int n1=n;
		while (n1!=0) {
			rem = n1 % 10;
			sum += rem * rem * rem;
			n1 = n1 / 10;
		}
		if (sum == n) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		System.out.println(checkarmstrongNo(153));
	}

}
