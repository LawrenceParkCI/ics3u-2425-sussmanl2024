package unit2;

import java.util.Scanner;

/**
Description: Learning how strings lengths and chars work in a for loop
Date: 26/11/24
@author Leo Sussman
*/

public class StringLengthAndChars {

/**
* @param args unused
*/

  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    /*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
    */
    
    String name = "Ms. Kemp";

    //write comments for the following code - what does it print out, and why?
    System.out.println(name.length());//how many characters are in the string, including spaces
    System.out.println(name.charAt(1));//charAt starts counting at 0, so charAt(1) is actually the second character, s
    System.out.println(name.charAt(2));//the third character is a period, .
    System.out.println(name.charAt(3));//the fourth character is a space so it looks blank
  
    //.length() gets the _____________
    //.charAt(position) gets the _______________
        //counting starts at _____________

    /**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
    */
    System.out.println("What's your name");
    String nameInput = sc.nextLine();
    for (int i = 0; i < nameInput.length(); i++) {
    	System.out.println(nameInput.charAt(i));
    	
    }
    
    
    
sc.close();
  }
}