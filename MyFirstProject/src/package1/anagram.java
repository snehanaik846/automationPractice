package package1;

import java.util.ArrayList;
import java.util.Arrays;

public class anagram {

	public static boolean anagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		String sortedstr1=sortchar(str1);
		String sortedstr2=sortchar(str2);
		if(sortedstr1.equals(sortedstr2)) {
			return true;
		}
		return false;

	}
	public static String sortchar(String word) {
		char[] a=word.toCharArray();
		Arrays.sort(a);
		return String.valueOf(a);
	}

	public static void main(String[] args) {

		String str1 = "javas";
		String str2 = "aajvs";
		System.out.println(anagram(str1, str2));
	}

}
