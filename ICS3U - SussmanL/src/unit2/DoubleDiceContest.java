package unit2;
/**
 * Description: Simulates rolling dice, and announcing who won
 * Date: Nov. 19th
 * @author Leo Sussman
 */
public class DoubleDiceContest {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		int personDice1;
		int personDice2;
		int aiDice1;
		int aiDice2;
		System.out.print("Rolling....         ");
		Thread.sleep(1000);
		personDice1 = (int)(Math.random()*6) + 1;
		System.out.println("Your first dice rolled a " + personDice1);
		System.out.print("Rolling....         ");
		Thread.sleep(1000);
		personDice2 = (int)(Math.random()*6) + 1;
		System.out.println("Your second dice rolled a " + personDice2);
		Thread.sleep(1000);
		aiDice1 = (int)(Math.random()*6) + 1;
		aiDice2 = (int)(Math.random()*6) + 1;		
		System.out.println("The computer rolled a " + aiDice1 + " and a " + aiDice2);
		Thread.sleep(1000);
		
		int humanAmount = personDice1 + personDice2;
		int aiAmount = aiDice1 + aiDice2;
		
		
		if (humanAmount > aiAmount) {
			System.out.println("Congrats, you win!");
			
		}else if (aiAmount > humanAmount) {
			System.out.println("Sorry, the computer beat you");
			
		}else {
			System.out.println("A tie, very interesting");
		}
		
		
		
		
	}

}
