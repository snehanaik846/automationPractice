package package1;

public class RemoveWhitespaces {

	public static String whitespc(String in) {
		StringBuilder o = new StringBuilder();
		char[] i = in.toCharArray();
		for (char c : i) {
			if (!Character.isWhitespace(c)) {
				o.append(c);
			}

		}
		return o.toString();
	}

	public static int suminarray() {
		int sum = 0;
		int[] a1 = { 1, 2, 6 };
		for (int i : a1) {
			sum += i;
		}
		return sum;

	}
	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		System.out.println(highest +" "+secondHighest);
		for (int i : array) {
			if (i > highest) {
				System.out.println(highest +" "+secondHighest);
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}
	
	private static int findSecondLowest(int[] array) {
		int lowest = Integer.MAX_VALUE;
		int secondlowest = Integer.MAX_VALUE;
		System.out.println(lowest +" "+secondlowest);
		for (int i : array) {
			if (i < lowest) {
				System.out.println(lowest +" "+secondlowest);
				secondlowest = lowest;
				lowest = i;
			} else if (i < secondlowest) {
				secondlowest = i;
			}

		}
		return secondlowest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(whitespc("Sneha Naik is"));
		System.out.println(suminarray());
		int[] a2 = { 6,17,8,19 };
		System.out.println(findSecondLowest(a2));


	}

}
