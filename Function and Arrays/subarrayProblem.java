import java.util.Scanner;

public class subarrayProblem {
	static Scanner scn = new Scanner(System.in);

	public static int[] arrayInput(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void printSubarray(int[] arr) {
		for (int si = 0; si < arr.length; si++) { // si = starting index
			for (int ei = si; ei < arr.length; ei++) { // ei = ending index
				for (int i = si; i <= ei; i++) {
					System.out.print(arr[i] + "\t");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int n1 = scn.nextInt();
		int[] arr = arrayInput(n1);

		printSubarray(arr);
	}
}