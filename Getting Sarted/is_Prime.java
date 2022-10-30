// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

// Constraints
// 1 <= t <= 10000
// 2 <= n < 10^9

// Format
// Input
// A number t
// A number n
// A number n
// .. t number of times

// Output
// prime
// not prime
// not prime
// .. t number of times

// Example
// Sample Input

// 5
// 13
// 2
// 3
// 4
// 5

// Sample Output
// prime
// prime
// prime
// not prime
// prime

import java.util.Scanner;

public class is_Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			int num = scn.nextInt();

			int count = 0;
			for (int div = 2; div * div <= num; div++) { // dividing number till root num
				if (num % div == 0) {
					count++;
					break; // breaking from loop if number gets divided
				}
			}

			if (count == 0) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}

		}
	}
}