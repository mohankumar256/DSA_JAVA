import java.util.Scanner;

public class firstIndexAndLastIndex {

	public static void firstAndLastIndex(int[] arr, int data) {

		int left = 0;
		int right = arr.length - 1;
		int firstIndex = -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data < arr[mid])
				right = mid - 1;
			else if (data > arr[mid])
				left = mid + 1;
			else {
				firstIndex = mid;
				right = mid - 1;
			}
		}
		System.out.println(firstIndex);

		left = 0;
		right = arr.length - 1;
		int lastIndex = -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data < arr[mid])
				right = mid - 1;
			else if (data > arr[mid])
				left = mid + 1;
			else {
				lastIndex = mid;
				left = mid + 1;
			}
		}
		System.out.println(lastIndex);
	}

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int data = scn.nextInt();

		firstAndLastIndex(arr, data);
	}
}