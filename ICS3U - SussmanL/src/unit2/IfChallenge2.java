package unit2;
import java.util.Scanner;
/**
 * Description: If Challenge 2
 * Date: Nov 5th 2024
 * @author Leo S
 * 
 * ussman
 */


public class IfChallenge2 {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
    //This is for the portfolio
	  int num1;
	  int num2;
	  int num3;
System.out.println("please input three whole numbers");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	
	if (num1 < num2) {
		if (num2 < num3) {
			System.out.println("Your numbers are in order");
		}else {
			System.out.println("The numbers are not in order");
		}	
	} else {
		System.out.println("The numbers are not in order");
	}
	
    /*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
    */
	sc.close();
  }
}