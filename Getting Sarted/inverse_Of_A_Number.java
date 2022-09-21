import java.util.Scanner;

public class inverse_Of_A_Number {
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int inverted_number = 0;
		int original_position = 1;

		while(num != 0){
			int last_digit = num % 10;
			int inverted_digit = original_position;

			inverted_number = inverted_number + inverted_digit * (int)Math.pow(10, last_digit-1);

			num = num / 10;

			original_position++;
		}

		System.out.println(inverted_number);
	}
}