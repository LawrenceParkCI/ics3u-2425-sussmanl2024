package unit1;
/**
 * Description: This program calculates how many hours somebody has been asleep in their life<br>
 * Date: 4/10/2024 
 * @author Leo Sussman
 */
import java.util.Scanner;
public class Alive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//all the variables it is asking for
		int birthYear;
		int birthMonth;
		int birthDay;
		int currentYear;
		int currentMonth;
		int currentDay;
		double hoursDaily;
		//asking the questions, that then gives a value to the variables
		System.out.println("After each question, answer in number form and then press <ENTER>");
		System.out.println("What year were you born?");
		birthYear=sc.nextInt();
		System.out.println("What month were you born? (1-12)");
		birthMonth=sc.nextInt();
		System.out.println("What day were you born? (1-30)");
		birthDay=sc.nextInt();
		System.out.println("What year is it?");
		currentYear=sc.nextInt();
		System.out.println("What month is it? (1-12)");
		currentMonth=sc.nextInt();
		System.out.println("What day is it? (1-30)");
		currentDay=sc.nextInt();
		System.out.println("On average how many hours do you sleep per day");
		hoursDaily=sc.nextDouble();
		//the math
		double daysAlive = 365 * (currentYear-birthYear) + 30 * (currentMonth-birthMonth) + (currentDay-birthDay);
		double hoursSlept = daysAlive * hoursDaily;
		double yearsAlive = daysAlive/365;
		yearsAlive = yearsAlive*1000;
		yearsAlive = (int) yearsAlive;
		yearsAlive = (double) yearsAlive/1000;

		//final result
		System.out.println("You have been alive for "  + yearsAlive + " years");
		System.out.println("You have been alive for "  + daysAlive + " days");
		System.out.println("You have slept for " + hoursSlept + " hours");
		sc.close();
	}

}
