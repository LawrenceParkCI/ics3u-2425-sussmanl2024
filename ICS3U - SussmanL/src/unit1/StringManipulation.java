package unit1;
import java.util.Scanner;
/**
 * Description: This program manipulates a string that is inputed to the program<br>
 * Date: 7/10/2024 
 * @author Leo Sussman
 */
public class StringManipulation {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String s;
		//getting the user's sentence
		System.out.println("Please type any sentence, then press <ENTER>");
		s = sc.nextLine();
		//manipulating the string
		Thread.sleep(1000);
		System.out.println("Now it will be reprinted in all caps:");
		System.out.println(s.toUpperCase());
		System.out.println("----------------------------------------------");
		Thread.sleep(1000);	
		System.out.println("Now it will be reprinted in all lower case:");
		System.out.println(s.toLowerCase());
		System.out.println("----------------------------------------------");
		Thread.sleep(1000);
		System.out.println("Now it will tell you how many characters you typed:");
		System.out.println("The length of what you typed is " + s.length() + " characters long");
		System.out.println("----------------------------------------------");
		Thread.sleep(1000);
		System.out.println("Now it will tell you which character you typed at index 5 (actually the 6th character, including spaces):");
		System.out.println(s.charAt(5));
		System.out.println("----------------------------------------------");
		Thread.sleep(1000);
		//getting the first and last space
		int firstSpace = s.indexOf(" ");
		int lastSpace = s.lastIndexOf(" ");
		//first and last word
		System.out.println("The first word of the program is: " + s.substring(0, firstSpace));
		System.out.println("The last word of the program is: " + s.substring(lastSpace, s.length()));
		sc.close();
	}

}
