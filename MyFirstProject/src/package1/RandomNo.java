package package1;

import java.util.Random;

public class RandomNo {
	
	public static void randnu() {
		int min=70;
		int max=80;
		Random r = new Random();
		int randno=r.nextInt(max);
		while(randno<=min) {
			System.out.println(randno);
		}
		
		
	}

	public static void main(String[] args) {
		int min=70;
		int max=80;
		Random r = new Random();
		int randno=r.nextInt(max-min)+min;
		System.out.println(randno);
		}

}
