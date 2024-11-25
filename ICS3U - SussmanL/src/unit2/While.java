package unit2;
/**
Description: Learning while loops
Date: nov 25th, 2024
@author Leo Sussman
*/

import java.util.Scanner;

public class While {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   
   
   
   /*
   System.out.println("How many people are you planning to see?");

   //Why do you think I coded it this way?
   int numPeople = Integer.parseInt(sc.nextLine());

   while (numPeople > 0) {
     System.out.print("What is this person's name? ");

     //Why do you think the variable is declared here?
     String name = sc.nextLine();
     System.out.println("Welcome, " + name + "!");

     numPeople = numPeople - 1;
   }
   */

  
   
   
   
   
   //Run the code Using the debugger. 
   //Explain the code in your own words
//it gets the number of people coming, and asks you the name of each person until theres no more people left
   //What code is repeated?    
   /*while (numPeople > 0) {
   System.out.print("What is this person's name? ");

   //Why do you think the variable is declared here?
   String name = sc.nextLine();
   System.out.println("Welcome, " + name + "!");

   numPeople = numPeople - 1;
 }
 */
   //When does it decide whether to repeat or not?
   //What is the condition for repeating?


   //What is the difference between a while loop and a do-while loop?


   //Create a while loop that asks for a word, 
   //and prints it out 20 times.
   
   
   int num = 20;
   System.out.println("Give me a word");

   //Why do you think the variable is declared here?
   String word = sc.nextLine();
   while (num > 0) {

	     System.out.println(word);

	     num = num - 1;
	   }
   
   
   
   
   sc.close();
 }
}