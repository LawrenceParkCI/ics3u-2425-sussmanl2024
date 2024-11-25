package unit2;
import java.util.Scanner;

/**
Description: Loop Challenge 2 
Date: nov 25th, 2024
@author Leo Sussman
*/

public class LoopChallenge2 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("input a whole number");
	  int num = sc.nextInt();

	   while (num < 0) {

		     System.out.println("That's not a positive number, we can't do anything with that. Try again");
		     num = sc.nextInt();
		   } 
	  System.out.println("Nice choice, the square root of that is " + Math.sqrt(num));
	  
	  
	  /*
      Write ,a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.
      
      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.
      
      Use the loop that you didn't use in LoopChallenge1
    */
	   sc.close();
  }
}