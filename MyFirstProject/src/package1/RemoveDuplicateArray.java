package package1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicateArray {
	
	public static StringBuilder numberstring(String s) {
		StringBuilder m = new StringBuilder();
		char[] a = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(a[i])) {
				m.append(a[i]);
			}
			else {
				System.out.println("Not a number");
			}
			
		}
		
		return m;
		
	}


	public static void main(String[] args) {
		//int a[]= {1,2,3,3,4};
		List <Integer> a= new ArrayList<Integer>();
		a.add(2);
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(4);
		
		Set <Integer> s=new LinkedHashSet<Integer>(a);
		List <Integer> a2= new ArrayList<Integer>();
		a2.addAll(s);
		for(int x : a2) {
			System.out.println(x);
		}
		System.out.println(numberstring("sneha1234"));
		
	}
	

}
