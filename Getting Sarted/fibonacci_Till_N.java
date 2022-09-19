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