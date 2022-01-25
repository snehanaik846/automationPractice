package package1;

public class IntegerPalindrome {
	public static int reverseInt(int n) {
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

	public static String IntPalin(int n) {
		if(reverseInt(n)==n) {
			return "Palindrome";
		}
		return " not a Palindrome";
	}

	public static void main(String[] args) {
		System.out.println(IntPalin(1231));
	}

}
