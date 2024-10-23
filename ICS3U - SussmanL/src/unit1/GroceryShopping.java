package unit1;
/**
 * Description: The unit 1 final assignment, making a grocery shopping receiptbr>
 * Date: 18/10/2024 
 * @author Leo Sussman
 */
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
public class GroceryShopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		//the variables for what they are buying, cost and amount
		String firstBuy;
		String secondBuy;
		double firstCost;
		double secondCost;
		int firstAmount;
		int secondAmount;
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
		String formattedDate = date.format(dateFormat);
		System.out.println("|| $$$ \\\\\\  ========== \"Mr. Sussman's Grocery\" ========== /// $$$ ||");
		System.out.println("After each question, answer then press <ENTER>, for answers that involve numbers just put numbers.");
		//asking for the products, cost and quantity
		System.out.println("What do you want to buy?");
		firstBuy = sc.nextLine()+"                ";//making sure there is no error with the receipt while printing, because of the substrings to limit the length of the input
		System.out.println("How many of those do you want");
		firstAmount = sc.nextInt();
		System.out.println("What is the cost for one of them?");
		firstCost = sc.nextDouble();
		sc.nextLine();
		System.out.println("What else do you want to buy?");
		secondBuy = sc.nextLine()+"                ";//making sure there is no error with the receipt while printing, because of the substrings to limit the length of the input
		System.out.println("How many of those do you want");
		secondAmount = sc.nextInt();
		System.out.println("What is the cost for one of them?");
		secondCost = sc.nextDouble();
		//getting the subtotals, tax and finl cost
		double firstSubtotal = firstCost*firstAmount;
		double secondSubtotal = secondCost*secondAmount;
		final double subtotal = firstSubtotal+secondSubtotal;
		final double tax = subtotal*0.13;
		double finalCost = subtotal+tax;
		//printing the receipt
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Mr. Sussman's Grocery");
		System.out.println(formattedDate);//printing date and time
		System.out.format("Item %-11s|Price %-11s|Quant. %-10s|Total Price %-10s %-1s","","",""," ","\n");
		System.out.println("--------------------------------------------------------------------");
		System.out.format("%-16s|%-17s|%-17s|%-16s %-1s",firstBuy.substring(0, 16),money.format(firstCost),firstAmount,money.format(firstSubtotal), "\n");
		System.out.format("%-16s|%-17s|%-17s|%-16s %-1s",secondBuy.substring(0, 16),money.format(secondCost),secondAmount,money.format(secondSubtotal), "\n");
		System.out.println("--------------------------------------------------------------------");
		System.out.format("%-47s %-1s %-1s","", "Subtotal: " + money.format(subtotal), "\n");
		System.out.format("%-52s %-1s %-1s","", "Tax: " + money.format(tax), "\n");
		System.out.format("%-45s %-1s %-1s","", "Final Cost: " + money.format(finalCost), "\n");
		//rounding to nearest dollar
		System.out.println("This is approximately " + money.format(Math.round(finalCost)));
		//rounding to nearest 5 cents
		finalCost = finalCost*20;
		finalCost = (int) Math.round(finalCost);
		finalCost = (double) finalCost/20;
		System.out.println("This is approximately " + money.format(finalCost));
		System.out.println();
		System.out.println("HAVE A GOOD DAY!");
		System.out.println("THANK YOU FOR SHOPPING AT MR. SUSSMAN'S GROCERY!! HOPE TO SEE YOU AGAIN :)");
		sc.close();
	}
}
