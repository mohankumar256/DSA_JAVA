import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) { // for rows
			
			for (int j = 1; j <= i; j++) // for stars
				System.out.print("*\t");

			System.out.println();
		}
	}
}
