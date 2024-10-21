package unit1;
/**
 * Description: The unit 1 final assignment<br>
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
	String firstBuy;
	String secondBuy;
	double firstCost;
	double secondCost;
	double firstAmount;
	double secondAmount;
	LocalDateTime date = LocalDateTime.now();
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
	String formattedDate = date.format(dateFormat);
	System.out.println("|| $$$ \\\\\\  ========== \"Mr. Sussman's Grocery\" ========== /// $$$ ||");
	System.out.println("After each question, answer then press <ENTER>, for answers that involve numbers just put numbers.");
	//asking for the products, cost and quantity
	System.out.println("What do you want to buy?");
	firstBuy = sc.nextLine();
	System.out.println("How many of those do you want");
	firstAmount = sc.nextDouble();
	System.out.println("What is the cost for one of them?");
	firstCost = sc.nextDouble();
	sc.nextLine();
	System.out.println("What else do you want to buy?");
	secondBuy = sc.nextLine();
	System.out.println("How many of those do you want");
	secondAmount = sc.nextDouble();
	System.out.println("What is the cost for one of them?");
	secondCost = sc.nextDouble();
	double firstSubtotal = firstCost*firstAmount;
	double secondSubtotal = secondCost*secondAmount;
	double subtotal = firstSubtotal+secondSubtotal;
	double tax = subtotal*0.13;
	double finalCost = subtotal+tax;
	System.out.println("--------------------------------------------------------------------");
	System.out.println("Mr. Sussman's Grocery");
	System.out.println(formattedDate);
	System.out.format("Item %-11s|Price %-11s|Quant. %-10s|Total Price %-10s %-1s","","",""," ","\n");
	System.out.println("--------------------------------------------------------------------");
	System.out.format("%-16s|%-17s|%-17s|%-16s %-1s",firstBuy,money.format(firstCost),firstAmount,money.format(firstSubtotal), "\n");
	System.out.format("%-16s|%-17s|%-17s|%-16s %-1s",secondBuy,money.format(secondCost),secondAmount,money.format(secondSubtotal), "\n");
	System.out.println("--------------------------------------------------------------------");
System.out.println("\t\t\t\t\t\t Subtotal: " + money.format(subtotal));
System.out.println("\t\t\t\t\t\t Tax: " + money.format(tax));
System.out.println("\t\t\t\t\t\t Final Cost: " + money.format(finalCost));
	sc.close();
	}

}
