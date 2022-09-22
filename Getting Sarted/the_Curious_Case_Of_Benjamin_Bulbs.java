import java.util.Scanner;

public class the_Curious_Case_Of_Benjamin_Bulbs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int number = scn.nextInt();

		for (int i = 1; i * i <= number; i++) {
			System.out.println(i * i);
		}
	}
}