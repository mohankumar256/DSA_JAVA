import java.util.Scanner;

public class is_Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			int num = scn.nextInt();

			int count = 0;
			for (int div = 2; div * div <= num; div++) { // dividing number till root num
				if (num % div == 0) {
					count++;
					break; // breaking from loop if number gets divided
				}
			}

			if (count == 0) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}

		}
	}
}
