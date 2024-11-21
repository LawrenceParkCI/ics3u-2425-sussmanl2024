package unit1;
/**
 * Description: This program finds the net pay for an employee<br>
 * Date: 4/10/2024 
 * @author Leo Sussman
 */
public class NetPay {

	public static void main(String[] args) {
		//how much money each thing is
		double hours = 40.00;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.78;
		//the math to calculate his wages
		double netPay = (hours * wage - insurance) * tax;
		System.out.println("The net pay for the employee is $" + netPay);
	}

}
