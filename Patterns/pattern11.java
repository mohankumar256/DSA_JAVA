import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) { // for rows

			for (int j = 1; j <= i; j++) { // for numbers
				count++;
				System.out.print(count + "\t");
			}

			System.out.println();
		}
	}
}