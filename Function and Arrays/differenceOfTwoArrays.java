import java.util.Scanner;

public class differenceOfTwoArrays {
	static Scanner scn = new Scanner(System.in);

	public static int[] arrayInput(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void displayArray(int[] arr) {
		int idx = 0;
		while (idx < arr.length) {
			if (arr[idx] != 0)
				break;
			else
				idx++;
		}
		while (idx < arr.length) {
			System.out.println(arr[idx]);
			idx++;
		}
	}

	public static void arrayDifference(int[] arr1, int[] arr2, int[] diff) {

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = diff.length - 1;

		int borrow = 0;

		while (k >= 0) {
			int lastDigit = arr2[j] - borrow;
			if (i >= 0)
				lastDigit -= arr1[i];

			if (lastDigit < 0) {
				lastDigit += 10;
				borrow = 1;
			} else
				borrow = 0;

			diff[k] = lastDigit;

			i--;
			j--;
			k--;
		}

		displayArray(diff);
	}

	public static void main(String[] args) {
		int n1 = scn.nextInt();
		int[] arr1 = arrayInput(n1);

		int n2 = scn.nextInt();
		int[] arr2 = arrayInput(n2);

		int[] diff = new int[n2];

		arrayDifference(arr1, arr2, diff);
	}
}