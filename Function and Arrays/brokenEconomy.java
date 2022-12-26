import java.util.Scanner;

public class brokenEconomy {

	public static void floorAndCeil(int[] arr, int data) {

		int left = 0;
		int right = arr.length - 1;
		int ceil = -1;
		int floor = -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data < arr[mid]) {
				right = mid - 1;
				ceil = arr[mid];
			} else if (data > arr[mid]) {
				left = mid + 1;
				floor = arr[mid];
			} else {
				ceil = arr[mid];
				floor = arr[mid];
				break;
			}
		}
		System.out.println(ceil);
		System.out.println(floor);

	}

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int data = scn.nextInt();

		floorAndCeil(arr, data);
	}
}