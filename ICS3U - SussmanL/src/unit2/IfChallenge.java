package unit2;
import java.util.Scanner;
/**
 * Description: If Challenge
 * Date: Nov 5th 2024
 * @author Leo Sussman
 */
public class IfChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double favNum;

		/*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If th0eir number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
		 */

		System.out.println("Please insert your favorite number");
		favNum = sc.nextDouble();
		if (favNum != Math.abs(favNum)) {
			System.out.println("You need to look on the bright side");
		}
		if (favNum % 2 != 0) {
			System.out.println("Your number is a bit strange");
		}
		if (favNum % 6 == 0) {
			System.out.println("You should really consider thinking about 6");
		} else {
			System.out.println("You can keep wholesome");
		}
		if(favNum % 10 == 8) {
			System.out.println("You are too full");
		} else if (favNum % 10 == 9){
			System.out.println("Canada is a nice country");
		} else {
			System.out.println("don't count on it");
		}

		sc.close();
	}
}