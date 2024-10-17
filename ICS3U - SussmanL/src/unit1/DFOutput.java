package unit1;
/**
 * Description: This program teaches me how to use decimalformat<br>
 * Date: 10/10/2024 
 * @author Leo Sussman
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		//11.3
		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + money.format(total));
		

		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		//it formated it into 2 decimal points, like how money looks
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		//It adds the money sign to the start
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		//it said 11.3 instead now
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening?
		//it is rounding to 2 decimal places
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		//The cost of your item with tax is $139505.28
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//The cost of your item with tax is $139,505.28      This is because we added space for commas every 3 numbers
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		//0.13
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		//it is no longer a decimal, and now puts it as a whole number with a percent sign

		sc.close();
	}

}
