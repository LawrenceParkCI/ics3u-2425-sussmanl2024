package unit1;
/**
 * Description: This program also teaches me how to use casting<br>
 * Date: 10/10/2024 
 * @author Leo Sussman
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		//implicit
		System.out.println(myChar + 1);
		//explicit
		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?

		//Why do you think this happens?
		//Investigate what is ASCII. What is it?
		//Can you find the number value for 'a'? Does it match with your findings above?
		//it is 97
		//create a new character myCharCap, and transform myChar into a capital 'A' and print it


		System.out.println(myChar - 32);
		char myCharCap = (char) (myChar - 32);
		System.out.println(myCharCap);
	}
}