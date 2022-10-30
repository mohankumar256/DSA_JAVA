import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1) { // first row
					if (j > n / 2 + 1 && j < n) // 1st half and last stars
						System.out.print("\t");
					else
						System.out.print("*\t");
				} else if (i <= n / 2) { // first half
					if (j == n / 2 + 1 || j == n) // middle and last star
						System.out.print("*\t");
					else
						System.out.print("\t");
				} else if (i == (n + 1) / 2) { // middle row
					System.out.print("*\t"); // all stars
				} else if (i < n) { // second half
					if (j == n / 2 + 1 || j == 1) // 1st and middle star
						System.out.print("*\t");
					else
						System.out.print("\t");
				} else { // last row
					if (j < n / 2 + 1 && j > 1) // 1st column and 2nd half stars
						System.out.print("\t");
					else
						System.out.print("*\t");
				}
			}

			System.out.println();

		}
	}
}