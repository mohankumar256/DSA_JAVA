import java.util.Scanner;

public class digits_Of_A_Number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int nod = 0;
		int temp = num;

		while (temp != 0) {   //counting the number of digits
			temp = temp / 10;
			nod++;
		}

		int div = (int) Math.pow(10, nod - 1); // generating divisor

		while (div != 0) {
			int quotient = num / div; // getting first digit
			System.out.println(quotient);

			num = num % div; // getting rest of the digits
			div = div / 10;  // reducing divisor
		}

	}
}
