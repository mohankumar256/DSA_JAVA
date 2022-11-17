import java.util.Scanner;

public class decimalToAnyBase {

	public static int getValueInBase(int num, int base) {

		int valueInBase = 0; // number after conversion to another base
		int power = 1; // 10^0

		while (num != 0) {
			int remainder = num % base;
			num /= base;
			valueInBase += remainder * power; // 4*10^0, 5*10^1 ...
			power *= 10; // increase power 10^0 -> 10^1
		}
		return valueInBase;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int base = scn.nextInt();

		int convertedNumber = getValueInBase(num, base);
		System.out.println(convertedNumber);
	}
}