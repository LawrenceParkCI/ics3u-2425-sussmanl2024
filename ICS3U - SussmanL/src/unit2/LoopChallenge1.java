package unit2;

import java.util.Scanner;

/**
Description:
Date:
@author
*/

public class LoopChallenge1 {
 public static void main(String[] args) throws InterruptedException {
	 Scanner sc = new Scanner(System.in);
	 
	 
	 System.out.println("What's the password?");
	 System.out.println("I'll do the first one for you: Password1");
	 Thread.sleep(3000);
	   String password;
		   do {		
	
			   System.out.println("Wrong, what's the password?");	
			   password = sc.nextLine();
			   } while (!password.equals("349176552"));
		 
		        System.out.println("UNLOCKED");
			 

		     
		   
   /*
    * 
    * 
    *  || tries != 0
    * 
    * 
    * 
    * 
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.
     
     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
   */
	 sc.close();
 }
}