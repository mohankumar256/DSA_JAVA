import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int sp = n / 2; // no. of space
		int st = 1; // no. of stars
		int val = 1; // for controlling numbers in row
		int ival = 1; // for controlling numbers in column

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++)
				System.out.print("\t");

			ival = val;

			for (int k = 1; k <= st; k++){
				System.out.print(ival +"\t");
				if(k <= st/2) // eg. like if there are 3 stars in a row then till middle star increase ival and then decrease
					ival++;
				else
					ival--;
			}

			System.out.println();

			if (i <= n / 2) {
				sp--;
				st += 2;
				val++;
			} else {
				sp++;
				st -= 2;
				val--;
			}
		}
	}
}