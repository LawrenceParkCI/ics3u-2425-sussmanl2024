package unit2;

import java.util.Scanner;

/**
Description: The first challenge program with for loops
Date:26/11/24
@author Leo Sussman
*/

public class ForChallenge1 {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	  
		System.out.println("Opening Value?");
		double firstValue = sc.nextDouble();
		System.out.println("Final Value?");
		double lastValue = sc.nextDouble();
		System.out.println("Incriment of Change?");
		double changeAmount = sc.nextDouble();



		for (double i = firstValue; i <= lastValue; i += changeAmount) {
			System.out.print(i + " ");
		}

	  
	  
    /*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
    */
		sc.close();
  }
}