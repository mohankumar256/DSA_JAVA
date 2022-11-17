import java.util.Scanner;

public class anyBaseSubtraction {

	public static int getDifference(int base, int num1, int num2) {
		int result = 0;
		int borrow = 0;
		int power = 1;

		while (num2 > 0) {
			int digit1 = num1 % 10;
			num1 /= 10;
			int digit2 = num2 % 10;
			num2 /= 10;

			int sub = digit2 - borrow - digit1;

			if (sub < 0) {
				borrow = 1;
				sub += base; // if sub = -1, sub + base (-1 + 10 = 9)
			} else {
				borrow = 0;
			}

			result += sub * power;
			power *= 10;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int base = scn.nextInt();
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int result = getDifference(base, num1, num2);
		System.out.println(result);
	}
}