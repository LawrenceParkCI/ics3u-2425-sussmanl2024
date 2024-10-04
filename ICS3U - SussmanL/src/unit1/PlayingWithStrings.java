package unit1;
/**
 * Description: This program teaches me how to use strings with scanning<br>
 * Date: 1/10/2024 
 * @author Leo Sussman
 */
import java.util.Scanner;
public class PlayingWithStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "            I am enjoying this class.        ";
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Character at index 6 = " + letter);
		
		System.out.println(msg.trim());
		sc.close();
	}

}
