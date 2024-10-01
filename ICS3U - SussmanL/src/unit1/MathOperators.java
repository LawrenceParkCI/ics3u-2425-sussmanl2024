package unit1;
/**
 * Description: This program teaches me how to create variables<br>
 * Date: 26/9/2024 
 * @author Leo Sussman
 */
public class MathOperators {
	/**
	 *
	 * @param
	 */
	public static void main (String [] args) {
		/*
         Pre: Kind of Math, but not really
         What do you notice is happening?
		 */

		System.out.println("Butter" + "fly");

		System.out.println("1 + 2 + 3 + 4 + 5");

		System.out.println(1 + 2 + 3 + 4 + 5);

		System.out.println(1 + 2 + "3 + 4 + 5");

		System.out.println("1 + 2 + 3" + 4 + 5);


		//Why do you think the last two outputs act so differently?
//it adds the numbers when there isn't quotation marks as long as they are first up in the print statement

		//Summary: What are two possible roles of the + operator?
//add numbers and to put two different lines of text next to each other

		/*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
		 */

		// + means:
System.out.println("to add two numbers together");
		// - means:
System.out.println("to subtract two numbers from each other");
		// * means:
System.out.println("to multiply two numbers together");
		// / means: 
System.out.println("to divide two numbers together");


		//Print the following expression: (3 + 2) * 5
		//Print the following expression: 3 + 2 * 5
System.out.println((3+2) * 5);
System.out.println(3 + 2 * 5);
		//Was this expected? Why or why not?
		/*
         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit

         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */ 
double Celcius = 45;
double Fahrenheit = (Celcius * 9/5) + 32;
System.out.println(Fahrenheit + "°");

Fahrenheit = 900;
Celcius = (Fahrenheit - 32) * 5/9;


System.out.println(Celcius + "°");
		/*
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
		 */

		//I think % means: 
//It does division but only gives you the remainder
System.out.println("I will do 17 % 4 and it will give me 1, which is the remainder");
System.out.println(17 % 4);
	}
}