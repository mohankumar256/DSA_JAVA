import java.util.Scanner;

public class digitFrequency {

	public static int getDigitFrequency(int num, int digit) {
		int frequency = 0;
		while (num != 0) {
			int lastDigit = num % 10;
			num /= 10;

			if (lastDigit == digit)
				frequency++;
		}

		return frequency;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int digit = scn.nextInt();

		int frequency = getDigitFrequency(num, digit);

		System.out.println(frequency);
	}
}