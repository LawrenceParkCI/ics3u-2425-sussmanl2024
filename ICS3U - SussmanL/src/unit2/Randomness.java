package unit2;
/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description: Learning random numbers
Date: Nov 18th
@author: Leo Sussman
*/


public class Randomness {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      int Num = (int)(Math.random()*901) + 100;
      System.out.println(Num);
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated? 0-1, not including 1

    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    
  }
}