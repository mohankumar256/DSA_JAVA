import java.util.Scanner;

public class subsetsOfArray {

	public static void printSubsets(int[] arr) {

		int limit = (1 << arr.length); // 2^3

		for (int i = 0; i < limit; i++) {

			int decimal = i;
			String subsetString = "";

			for (int j = 0; j < arr.length; j++) {
				int remainder = decimal % 2;
				decimal /= 2;

				if (remainder == 0)
					subsetString = "-\t" + subsetString;
				else
					subsetString = arr[arr.length - 1 - j] + "\t" + subsetString;
			}

			System.out.println(subsetString);

		}
	}

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		printSubsets(arr);
	}
}