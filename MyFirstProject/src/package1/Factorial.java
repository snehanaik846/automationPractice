package package1;

public class Factorial {
	public static void fact(int n) {
		if(n==0) {
			System.out.println("fact is 0");
		}
		if(n==1) {
			System.out.println("fact is 1");
		}
		else {
			int sum=1;
			for(int i=1;i<=n;i++) {
				sum=sum*i;
				
			}
			System.out.println("fact is "+sum);
		}
	
		
		
	}
	public static int fact1(int n) {

		if(n==1)
			return 1;
		
		return n*(fact1(n-1));
		
	}
	public static void main(String[] args) {
		fact(4);
		System.out.println(fact1(4));
}

}
