package unit1;
/**
 * Description: This program calculates the cost for a carpet based on your needs<br>
 * Date: 7/10/2024 
 * @author Leo Sussman
 */
import java.util.Scanner;
public class Carpet {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		//the dimensions of the room as variables
		double carpetCost;
		double roomLength;
		double roomWidth;
		//getting the length, width and cost of carpet
		System.out.println("After each question, answer only with numbers (decimal places are ok). Then press <ENTER>");
		Thread.sleep(800);
		System.out.println("What is the length of your room in meters?");
		roomLength = sc.nextDouble();
		System.out.println("What is the width of your room in meters?");
		roomWidth = sc.nextDouble();
		System.out.println("What is the cost of the carpet per square meter?");
		carpetCost = sc.nextDouble();
		//math
		double finalCost = roomWidth*roomLength*carpetCost;
		System.out.println("The cost to cover your room in carpet will cost $" + finalCost);

		
		
		
		sc.close();
	}

}
