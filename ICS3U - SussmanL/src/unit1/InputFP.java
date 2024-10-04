package unit1;
/**
 * Description: This program teaches me how to use floating points<br>
 * Date: 1/10/2024 
 * @author Leo Sussman
 */
import java.util.Scanner;
public class InputFP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		System.out.println("AREA PROGRAM");
		System.out.println("Type in a number and press <ENTER>");
		num1 = sc.nextDouble();
		
		System.out.println("Type in a number and press <ENTER>");
		num2 = sc.nextDouble();
		
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();
	}

}
