package unit2;
import java.util.Scanner;
/**
 * Description: Tests if a number is odd or evenbr>
 * Date: 18/10/2024 
 * @author Leo Sussman
 */

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Please input a whole number");
		num = sc.nextInt();
		int absNum = Math.abs(num);
		if (num==absNum) {
			System.out.println("Your number is positive");
		}
		else {
			System.out.println("Your number is negative");
		}
		if (num%7==0) {
			System.out.println("Your number is divisible by 7");

		}
		else {
			System.out.println("Your number is not divisible by 7");
		}
		sc.close();
	}

}
