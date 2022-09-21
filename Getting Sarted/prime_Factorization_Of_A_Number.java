import java.util.Scanner;

public class prime_Factorization_Of_A_Number {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int number = scn.nextInt();

		for(int divisor = 2; divisor*divisor <= number; divisor++) {
			while(number % divisor == 0) {
				number /= divisor;
				System.out.print(divisor + " ");
			}
		}

		if(number != 1){
			System.out.print(number);
		}
	}
}