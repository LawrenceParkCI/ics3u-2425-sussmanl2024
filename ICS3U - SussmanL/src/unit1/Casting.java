package unit1;
import java.util.Scanner;
/**
 * Description: This program teaches me how to use casting<br>
 * Date: 10/10/2024 
 * @author Leo Sussman
 */
public class Casting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		System.out.println(doubleNum);
		//double, because it was declared as a double most recently
		//can you explain what is happening in this code?
		doubleNum = doubleNum + 2.2;
		//it added 2.2 to the value of doubleNum
		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);
		//int because doubleNum was casted as an int
		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double implicit 
      double to int explicit
      int to long implicit
      long to int explicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
		 */

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;
		System.out.println("Give me decimal number up to the hundredth");
		myNum = sc.nextDouble();
		myNum = myNum*10;
		myNum = (int) myNum;
		myNum = (double) myNum/10;



		//code 
		System.out.print("Rounding down to the nearest tenth, it is: " + myNum);
		sc.close();
	}
}