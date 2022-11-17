import java.util.Scanner;

public class anyBaseToDecimal {

	public static int getValueInDecimal(int num, int base) {

		int valueInDecimal = 0; // number after conversion to another base
		int power = 1; // base^0

		while (num != 0) {
			int remainder = num % 10;
			num /= 10;
			valueInDecimal += remainder * power; // 4*8^0, 5*8^1 ...
			power *= base; // increase power 8^0 -> 8^1
		}
		return valueInDecimal;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int base = scn.nextInt();

		int convertedNumber = getValueInDecimal(num, base);
		System.out.println(convertedNumber);
	}
}