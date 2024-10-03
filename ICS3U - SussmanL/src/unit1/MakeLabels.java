package unit1;
/**
 * Description: This program teaches me how to create variables<br>
 * Date: 2/10/2024 
 * @author Leo Sussman
 */
import java.util.Scanner;

public class MakeLabels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String subject;
		String name;
		System.out.println("Type in your name and press <ENTER>");
		name=sc.nextLine();
		System.out.println("Type in the subject and press <ENTER>");
		subject=sc.nextLine();
		System.out.println();
		System.out.println("********************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("********************************");
		sc.close();
	}

}
