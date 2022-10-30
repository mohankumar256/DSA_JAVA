import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) { // for rows
			int val = 1;
			for (int j = 0; j <= i; j++) { // for column
				System.out.print(val + "\t");
				val = val * (i - j) / (j + 1); // formula to calculate next digit nCr+1 = (nCr * (n-r))/(r+1)
			}

			System.out.println();
		}
	}
}