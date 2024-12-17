package unit3;
/**
Description:
 - Introduction
 - Using Static methods
 - Parts of a method
Date:
@author 
*/

public class Methods {
public static void main(String[] args) {
  /**
    Introduction
  */
    /*
    Methods help you modularize a program by separating its tasks into self-contained units.

    Pros:
    - Written only once – no repeated code
    - Methods can be reused (invoked, called) from several locations in a program
    - Divide and conquer approach - Constructing programs from small, simple pieces
    - Software reusability - Use existing methods/classes as building blocks to create new programs.
    - Dividing a program into meaningful methods/classes makes the program easier to debug and maintain.
    */
  /*
    Using Static Methods
  */
  //Print out a sentence about this school year

  /*
    You used a method! The println() method takes some information (parameter), and does something with it - in this case, it puts the text into the console.

    You as the user don't know how it works, but because someone has made it, you can simply use it again and again.
  */

  //Look below for part 2, and then come back  

  //explain what is happening
  int myNum = 30;
  myNum = doubleNumber(myNum);
  System.out.println(myNum);

 //Explain what is happening
  System.out.println(doubleNumber(5));


  //Part 3 is at the bottom, and return here to print out your method's return value
  
}


/**
  Part 2 - Parts of a method
  a) You notice the javadac comment above the method - this explains what the method is doing, if it has any input, and if it has any output
  b) public -> means this method is useable anywhere
  c) static -> means this method acts like a function - there are no "things" using the method
  d) int -> the value that is gotten as a result of the method; the *return value*
  e) doubleNumber -> the name of the method; how we will be able to use it in the code
  f)int num -> the values we need in order for the method to work, and what we will call it in the method; the *parameter*
      the *parameter* -> what the name of the variable which will hold the value is
      the *argument* -> the actual value that is passed into the method
*/

/**(a)
 * This method takes an integer and returns two times its
 * original value
 * @param num - a number to be doubled
 * @return int - a value that was double its original given value
*/
//(b)   (c)    (d)     (e)                 (f)
public static int doubleNumber(int num) {
  int returnValue = num * 2;
  return returnValue; //sends the information back to be used
}

/**
  Part 3 - Create your method
*/
public static int larger(int num1, int num2) {
	  int larger = Math.max(num1, num2);
	  return larger; //sends the information back to be used
	}



/*
  Create a method that has 2 int as parameters, and returns the larger one. The name of the method is larger.
*/
}