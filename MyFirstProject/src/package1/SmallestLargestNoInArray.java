package package1;

public class SmallestLargestNoInArray {

	public static void main(String[] args) {
		int temp = 0;
		int[] a = { 14, 52, 26, 76, 13 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				continue;
			}

		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);

		}
		System.out.println("Largest Number:"+a[0]);
		System.out.println("Smallest Number:"+a[4]);

	}

}
