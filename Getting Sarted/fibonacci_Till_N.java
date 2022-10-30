// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.

// Constraints
// 1 <= n < 40

// Format
// Input
// n

// Output
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// .. first n fibonacci's

// Example
// Sample Input

// 10

// Sample Output
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34

import java.util.Scanner;

public class fibonacci_Till_N {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int a = 0;  // first fibonacci number
		int b = 1; // second fibonacci number

		for (int i = 0; i < n; i++) {
			System.out.println(a); //printing fibonacci number
			int c = a + b; // third fibonacci number
			a = b;
			b = c;
		}
	}
}