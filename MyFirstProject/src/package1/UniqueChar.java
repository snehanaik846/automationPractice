package package1;

import java.util.Arrays;

public class UniqueChar {
public static int Unichar(String str1) {
	char[] a=str1.toCharArray();
	Arrays.sort(a);
	int count=0;
	for (int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
	}return count;
	
}
public static String substring1(String str1) {
	for (int i=0;i<str1.length();i++) {
		for(int j=i+1;j<=str1.length();j++) {
			System.out.println(str1.substring(i,j));
		}
	}
	return str1;
}
	public static void main(String[] args) {
		String str1 = "world";
		System.out.println(Unichar(str1));
		System.out.println(substring1("abbs"));

	}

}
