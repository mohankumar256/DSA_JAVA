import java.util.Scanner;

public class rotate_A_Number {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int number = scn.nextInt(); // 273516
		int number_of_rotations = scn.nextInt(); // 2

		int temp = number;
		int number_of_digits = 0;
		while(temp != 0) {
			temp = temp / 10;
			number_of_digits++; // 6
		}

		number_of_rotations = number_of_rotations % number_of_digits;
		if(number_of_rotations < 0) {
			number_of_rotations = number_of_rotations + number_of_digits;
		}

		int multiplier = 1;
		int divisor = 1;
		for(int i = 1; i <= number_of_digits; i++) {
			if(i <= number_of_rotations){
				divisor = divisor * 10;  // 100
			} else {
				multiplier = multiplier * 10; // 10000
			}
		}

		int quotient = number / divisor; // 2735
		int remainder = number % divisor; // 16

		int rotated_number = quotient + remainder * multiplier; // 2735 + 160000 = 162735

		System.out.println(rotated_number);
	}
}
