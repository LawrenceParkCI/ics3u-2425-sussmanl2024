package unit2;
import java.util.Scanner;
/**
 * Description: The string challenge
 * Date: Nov 11th 2024
 * @author Leo Sussman
 */

public class StringChallenge {
	public static void main(String[] args) {
		//This is for the portfolio
		Scanner sc = new Scanner(System.in);
		String answerStr;
		int  points = 0;
		String answerPoints;
		String finalPoints;

		System.out.println("Who is the best teacher?");
		answerStr = sc.nextLine();
		//if they typed the exact right thing, they get more points
		if (answerStr.equals("Ms. Kemp")) {
			System.out.println("Didn't even have to change anything, 3 points");
			points = points + 3;
			//if they were close with the capitals or lowercases they get one point
		}else if (answerStr.equalsIgnoreCase("Ms. Kemp")) {
			System.out.println("Close, you just need to capitalize right, 1 point");
			points = points + 1;
		}else {
			System.out.println("WHO? no points");
		}



		System.out.println("Hope you were counting, how many points do you have?");

		answerPoints = sc.nextLine();
		finalPoints = String.valueOf(points);
		if (answerPoints.compareTo(finalPoints) == 0 ) {
			System.out.println("Good job telling the truth, you win!!");
		}else {
			System.out.println("LIAR!! YOU FAIL!");
		}
		/*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.
    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
		 */


		sc.close();
	}
}
