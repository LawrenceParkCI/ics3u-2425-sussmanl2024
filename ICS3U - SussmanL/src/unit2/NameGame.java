package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
 */
public class NameGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
		int num;
		String Name;
System.out.println("Whats Your Name?");
Name = sc.nextLine();
num = (int)(Math.random()*10)+1;
if(num<=7) {
	System.out.println("Well, " + Name + " is my favourite name!");
}else 
	System.out.println("Ew, I hate that name");
	
sc.close();
	}

}
