import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0; // first fibonacci number
		int b = 1; // second fibonacci number
		int c = 0;

		for (int i = 1; i <= n; i++) { // for rows

			for (int j = 1; j <= i; j++) { // for numbers
				System.out.print(a + "\t");
				c = a + b;
				a = b;
				b = c;
			}

			System.out.println();
		}
	}
}