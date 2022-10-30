// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

// Constraints
// 1 <= n < 10^9

// Format
// Input
// "n" where n is any integer.

// Output
// "d" where d is the number of digits in the number "n"

// Example
// Sample Input

// 65784383

// Sample Output
// 8

import java.util.Scanner;

public class count_Digits_In_A_Number {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int count = 0;

		while (num != 0) {
			num = num / 10; //dividing number by 10 till number becomes zero
			count++;
		}
		System.out.println(count);
	}
}