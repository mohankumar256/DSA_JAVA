import java.util.Scanner;

public class gcd_And_Lcm {
	
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int number1 = scn.nextInt();
		int number2 = scn.nextInt();

		int divisor = number1;
		int dividend = number2;

		while(dividend % divisor != 0){
			int remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}

		int gcd = divisor;
		int lcm = (number1 * number2) / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}
}