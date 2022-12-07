import java.util.Scanner;

public class sumOfTwoArrays {
	static Scanner scn = new Scanner(System.in);

	public static int[] arrayInput(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void displayArray(int[] arr) {
		for (int element : arr) { // for-each loop
			System.out.println(element);
		}
	}

	public static void arraySum(int[] arr1, int[] arr2, int[] sum) {

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = sum.length - 1;

		int carry = 0;

		while (k >= 0) {
			int lastDigit = carry; // indirectly adding carry to sum

			if (i >= 0) {
				lastDigit += arr1[i];
			}

			if (j >= 0) {
				lastDigit += arr2[j];
			}

			carry = lastDigit / 10;
			lastDigit %= 10;

			sum[k] = lastDigit;

			i--;
			j--;
			k--;
		}
		if (carry > 0)
			System.out.println(carry);

		displayArray(sum);
	}
	
	public static void main(String[] args) {
		int n1 = scn.nextInt();
		int[] arr1 = arrayInput(n1);

		int n2 = scn.nextInt();
		int[] arr2 = arrayInput(n2);

		int[] sum = new int[n1 > n2 ? n1 : n2];

		arraySum(arr1, arr2, sum);
	}
}