// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

// Constraints
// 1 <= n < 10^9
// -10^9 < k < 10^9

// Format
// Input
// "n" where n is any integer.
// "K" where k is any integer.

// Output
// "r", the rotated number

// Example
// Sample Input

// 562984
// 2

// Sample Output
// 845629

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