package package1;

class squareroot{
	public static int sqrroot(int a) {
		int sqr=a*a;
		return sqr;
		
	}
	
}
public class swapingtwoNo {

	public static void main(String[] args) {
		int a=134;
		int b=51;
		System.out.println("Before swapping= "+a+" and "+b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping= "+a+" and "+b);
		System.out.println(squareroot.sqrroot(78));
	}

}
