package unit2;
import java.util.Scanner;
/**
 * Description: Learning how to do string comparison
 * Date: Nov 5th 2024
 * @author Leo Sussman
 */

class StringComparison {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = sc.nextLine();

    if (answer == "Toronto") {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }
    
    //Run the code. What happens when you type the correct answer? The incorrect answer?
//No matter what it is incorrect
    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
    */

    if (answer.equalsIgnoreCase() == "Toronto") {
        System.out.println("Correct!");
      } else {
        System.out.println("Sorry, that's incorrect.");
      }
    //What values does compareTo() return? How can we 
    //interpret the value?

    //what value does equals() and equalsIgnoreCase() return? 
    //What is the difference between these two functions?
    //one you need to submit the exact same string, the other allows any order of capitals or not, it just looks at the letters
    sc.close();
  }
}