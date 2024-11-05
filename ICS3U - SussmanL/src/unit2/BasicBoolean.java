package unit2;
/**
* Description: Basic Boolean Worksheet
* Date: Nov 5th 2024
* @author Leo Sussman
*/

public class BasicBoolean {
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either true or false
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because firstnum is smaller than second num
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because firstNUm is not bigger than secondNum
    System.out.println("2: " + (firstNum != secondNum)); 

    //this prints out True because 5=5
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out true because 5.5 is bigger than 5
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: greater than
      * < means: less than
      * <= means: less than or equal
      * >= means: greater than or equal
      * == means: equal
      * != means: not equal to
    */

  }
}