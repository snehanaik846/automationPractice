package package1;

public class Palindrome {
	public static void main(String args[]) {
		System.out.println("Is malayalam palindrom?: " + isPalindromString("malayalam"));
		System.out.println(vowels("sneha"));
	}
	public static boolean isPalindromString(String text) {
		String reverse = reverse1(text).toString();
		if (text.equals(reverse)) {
			return true;
		}
		return false;
	}
	
	//using recursive function
	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}
	//using string builder fucntion
	public static StringBuilder reverse1(String input) {
        StringBuilder input1 = new StringBuilder(input);
        //input1.append(input);
        return input1.reverse();
	}
	//contains vowels
	public static boolean vowels(String input) {
        StringBuilder input1 = new StringBuilder(input);
        return input.toLowerCase().matches(".*[aeiou]*.");
        
	}
}
