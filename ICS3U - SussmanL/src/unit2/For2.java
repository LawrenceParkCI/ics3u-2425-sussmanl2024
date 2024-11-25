package unit2;

import java.util.Scanner;

/**
Description: Learning more complicated for loops
Date: nov 25th, 2024
@author Leo Sussman
 */

public class For2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Recall - create a for loop printing 1 to 10:
		System.out.println("Counting up");
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}

		//though we are repeating a certain number of times, we can use variables in our for loops as well

		int times = 20;

		for (int i = 15; i < times; i++) {
			System.out.println(i);
		}

		//In addition, the counter doesn't necessarily have to be an integer
		double increment = 0.1;
		for (double i = 0; i < 2; i += increment) {
			System.out.print(i + " ");
		}

		//create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
		System.out.println();
		System.out.println();

		System.out.println("Opening Value?");
		double firstValue = sc.nextDouble();
		System.out.println("Final Value?");
		double lastValue = sc.nextDouble();
		System.out.println("Incriment of Change?");
		double changeAmount = sc.nextDouble();



		for (double i = firstValue; i <= lastValue; i += changeAmount) {
			System.out.print(i + " ");
		}



		//Look at the following code. Explain what is happening?

		int sum = 0; 

		for (int i = 1; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);


		sc.close();
	}
}