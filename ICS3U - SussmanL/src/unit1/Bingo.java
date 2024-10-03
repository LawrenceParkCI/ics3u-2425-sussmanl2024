package unit1;
/**
 * Description: This program randomly generates a bingo card to play with<br>
 * Date: 27/9/2024 
 * @author Leo Sussman
 */
public class Bingo {

	public static void main(String[] args) {
		//rules of bingo
		System.out.println("Bingo Card:");
		System.out.println("___________________________");
		System.out.println("1. The caller randomly pulls a numbered bingo card.");
		System.out.println("2. The number is placed on the bingo bord and called out.");
		System.out.println("3. Players look for the called number on their bingo card.");
		System.out.println("4. If the number is located, it is marked off.");
		System.out.println("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern");
		System.out.println("6. The winning player yells BINGO!");
		System.out.println("_____________________________________________________________________");
		// prints the squares to play on
		System.out.format(" B %5s %5s %5s %5s ","I", "N", "G", "O");
		System.out.format("\n 2 %5s %5s %5s %5s ","16", "32", "48", "62");
		System.out.format("\n 7 %5s %5s %5s %5s ","21", "34", "54", "64");
		System.out.format("\n 8 %5s %6s %4s %5s ","23", "Free", "56", "67");
		System.out.format("\n11 %5s %5s %5s %5s ","24", "37", "51", "74");
		System.out.format("\n14 %5s %5s %5s %5s ","28", "40", "47", "75");
	}
	//saving the % and ( symbol, as my computer can not type them
}
