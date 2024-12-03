package unit2;
import java.io.*;

/**
 * Description: learning how to acess stored data
 * Date: nov 28th 2024
 * @author Leo Sussman
 */


public class DemoWriting {
    public static void main(String[] args) {
        /*
         * Sometimes, we don't want a person to enter data, but we want to be able to
         * access stored data, such as getting Amazon price data from a database.
         * 
         * Other times, instead of showing the user the output, we want to store the
         * data in a permanent location, such that it can be used in other situations.
         * 
         * That's why we have the ability to read and write to a file.
         */

        String data = "This is the data in the output file";
        int num = 42;

        /*
         * Try Catch the program will try some code, and if a specific error happens,
         * then it will do the catch instead
         */
        try {
            //will try to write to output.txt. If it doesn't exist, it will create it
            File file = new File("output.txt");         
            // Creates a FileWriter
            PrintStream output = new PrintStream(file);

            // Writes the string to the file
            output.println(data);

            //output can only write String data, so you may need to cast data into string
            output.println("" + num);


            // Closes the writers
            output.close();
        }
        //if there is a problem with writing
        catch (IOException e) {
            System.out.println("Sorry, cannot write to that file.");
        }
    }
}