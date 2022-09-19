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