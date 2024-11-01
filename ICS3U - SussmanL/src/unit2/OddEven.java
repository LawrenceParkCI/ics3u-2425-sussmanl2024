package unit2;
import java.util.Scanner;
/**
 * Description: Tests if a number is odd or evenbr>
 * Date: 18/10/2024 
 * @author Leo Sussman
 */

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Please input a whole number");
		num = sc.nextInt();
		if (num%2==0) {
			System.out.println("Your number is even");

		}
		else {
			System.out.println("Your number is odd");
		}
		sc.close();
	}

}
