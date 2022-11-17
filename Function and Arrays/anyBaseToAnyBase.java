import java.util.Scanner;

public class anyBaseToAnyBase {

	public static int getValueInDecimal(int num, int base1) {

		int valueInDecimal = 0; // number after conversion to another base
		int power = 1; // base^0

		while (num != 0) {
			int remainder = num % 10;
			num /= 10;
			valueInDecimal += remainder * power; // 4*8^0, 5*8^1 ...
			power *= base1; // increase power 8^0 -> 8^1
		}
		return valueInDecimal;
	}

	public static int getValueInBase(int num, int base2) {

		int valueInBase = 0; // number after conversion to another base
		int power = 1; // 10^0

		while (num != 0) {
			int remainder = num % base2;
			num /= base2;
			valueInBase += remainder * power; // 4*10^0, 5*10^1 ...
			power *= 10; // increase power 10^0 -> 10^1
		}
		return valueInBase;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int base1 = scn.nextInt();
		int base2 = scn.nextInt();

		int toDecimal = getValueInDecimal(num, base1); // Any base -> Decimal -> Any Base
		int toAnyBase = getValueInBase(toDecimal, base2);
		System.out.println(toAnyBase);
	}
}