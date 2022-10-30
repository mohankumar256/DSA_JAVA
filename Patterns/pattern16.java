import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int sp = 2 * n - 3;
		int num = 1;

		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= num; k++) {
				System.out.print(k + "\t");
			}

			for (int k = 1; k <= sp; k++) {
				System.out.print("\t");
			}

			if (i == n)
				num--;

			for (int k = num; k >= 1; k--) {
				System.out.print(k + "\t");
			}

			System.out.println();

			sp -= 2;
			num++;
		}
	}
}