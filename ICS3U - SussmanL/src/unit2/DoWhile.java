package unit2;
/**
Description:
Date:
@author 
*/

import java.util.Scanner;

public class DoWhile {
 public static void main(String[] args) {
   /*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
   */
   Scanner sc = new Scanner(System.in);
   String name;
   do {
     System.out.print("What is your name? ");
     name = sc.nextLine();
   } while (!name.equals("Mr. Lee"));

   System.out.println("You are welcome into the secret secret pogchamp club.");

  

   //Run the code. Explain the code in your own words
//it repeats asking you until the answer is Mr. Lee
   //What code is repeated?
   //When does it decide whether to repeat or not?
   //What is the condition for repeating?


   /*
    Note:Pay attention to the brackets, and the semicolon
   */

   /*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
   */

   //Create a do-while loop that asks for a word, and 
   //prints it out 20 times.
   
   int repeat = 0;
   String input;
   System.out.println("GIVE ME A WORD");
   input = sc.nextLine();
   do {
	   System.out.println(input);
	   repeat = repeat+1;
	   } while (repeat != 20);
  
 
   
   
   
   sc.close();
 }
}