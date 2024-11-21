package unit2;
import java.util.Scanner;
/**
 * Description: If Statement 1 Worksheet
 * Date: Nov 5th 2024
 * @author Leo Sussman
 */

public class IfStatements2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = sc.nextInt();
		/*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
		 */
		//Looking at the logic above, why do you think the 
		//program won't work? 
		//If they are 18 it will fail because there is no area they fit into, also the variable is not declared in the else part so the print statement for the string needs to be in the if
		//Copy the code below, and try to find a solution.
		//Comment the code above to avoid compilation errors.
		
		if (userAge >= 18) { //If they're over 18, they are titled an adult
			String title = "Adult";
			System.out.println(title);
		} else {  //if they're not over 18, I don't want a title
			System.out.println("Sorry, not quite yet.");

		}
		sc.close();

	}
}