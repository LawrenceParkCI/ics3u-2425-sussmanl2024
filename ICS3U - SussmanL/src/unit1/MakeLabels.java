package unit1;
import java.util.Scanner;
/**
 * Description: This program teaches me how to scan and create labels<br>
 * Date: 2/10/2024 
 * @author Leo Sussman
 */
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
