package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ArrayListEg {
	
	public void listy() {
			List <String> list1= new ArrayList <String>();
			list1.add("Sneha");
			list1.add("priya");
			String s = "";
			System.out.println(s);
			Iterator i1=list1.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
				
			}
	}
	public static void main(String[] args) {

		ArrayListEg l=new ArrayListEg();
		l.listy();
		
	}


}
