import java.util.Scanner;
/**
 * Description: extra challenge switch1
 * Date: Nov 12th 2024
 * @author Leo Sussman
 */

public class Switch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("What number day is it?");
		int day = sc.nextInt();

		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("We don't have that day yet");
			break;
		}
*/
		//Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
		//What do you think default means? //everything there isnt a case for
		//What do you think break means? What happens when you remove a break? it puts the case and the one after together


		//Create another program, this time asking what day it is (String), and printing out how many days until the weekend
		System.out.println("What day is it?");
		String dayStr = sc.nextLine();
		sc.close();
		switch(dayStr) {
		
		case "Monday":
			System.out.println("5 days to the weekend");
			break;
		case "Tuesday":
			System.out.println("4 days to the weekend");
			break;
		case "Wednesday":
			System.out.println("3 days to the weekend");
			break;
		case "Thursday":
			System.out.println("2 days to the weekend");
			break;
		case "Friday":
			System.out.println("1 days to the weekend");
			break;
		default:
			System.out.println("It is the Weekend!!!!");
			break;
			
		}
	}
}