package unit1;
/**
 * Description: This program teaches me how to use decimalformat<br>
 * Date: 17/10/2024 
 * @author Leo Sussman
 */
import java.text.NumberFormat;
import java.util.Scanner;
public class NFOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//How can you change how your value is displayed?
		//by changing the type of NumberFormat
		//What other formats does NumberFormat offer?
		//getCompactNumberInstance, getNumberInstance, getInstance, getIntegerInstance, getPercentInstance


		sc.close();
	}

}
