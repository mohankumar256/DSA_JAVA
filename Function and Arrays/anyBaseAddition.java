import java.util.Scanner;

public class anyBaseAddition {

	public static int getSum(int base, int num1, int num2) {
		int sum = 0;
		int carry = 0;
		int power = 1; // 10^0

		while (num1 > 0 || num2 > 0 || carry > 0) {
			int digit1 = num1 % 10; // taking out last digit for addition
			num1 /= 10; // removing last digit

			int digit2 = num2 % 10; // taking out last digit for addition
			num2 /= 10; // removing last digit

			int add = digit1 + digit2 + carry;

			carry = add / base; // sum = 12 , carry = 1 if base = 10
			add %= base; // total sum = 12, then value = 2

			sum += add * power;
			power *= 10; // increasing power, 10^0 -> 10^1
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int base = scn.nextInt();
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int result = getSum(base, num1, num2);
		System.out.println(result);
	}

}