package unit1;
/**
 * Description: This program randomly generates a bingo card to play with<br>
 * Date: 26/9/2024 
 * @author Leo Sussman
 */
public class Bingo {
	//saving the % symbol, as my computer can not type it
	public static void main(String[] args) {
		System.out.println("Bingo Card:");
		System.out.println("___________________________");
		System.out.println("1. The caller randomly pulls a numbered bingo card.");
		System.out.println("2. The number is placed on the bingo bord and called out.");
		System.out.println("3. Players look for the called number on their bingo card.");
		System.out.println("4. If the number is located, it is marked off.");
		System.out.println("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern");
		System.out.println("6. The winning player yells BINGO!");
		System.out.println("_____________________________________________________________________");
//rules of bingo
		System.out.print("B");
		System.out.print("\t");
		System.out.print("I");
		System.out.print("\t");
		System.out.print("N");
		System.out.print("\t");
		System.out.print("G");
		System.out.print("\t");
		System.out.println("O");
//lists the columns
		int cAMin = 1;
		int cAMax = 15;
		int cBMin = 16;
		int cBMax = 30;
		int cCMin = 31;
		int cCMax = 45;
		int cDMin = 46;
		int cDMax = 60;
		int cEMin = 61;
		int cEMax =	75;
//values for the random numbers for each column

		for (int i = 0; i< 2; i++) {
			int CA = (int)Math.floor(Math.random() * (cAMax - cAMin + 1) + cAMin);
			int CB = (int)Math.floor(Math.random() * (cBMax - cBMin + 1) + cBMin);
			int CC = (int)Math.floor(Math.random() * (cCMax - cCMin + 1) + cCMin);
			int CD = (int)Math.floor(Math.random() * (cDMax - cDMin + 1) + cDMin);
			int CE = (int)Math.floor(Math.random() * (cEMax - cEMin + 1) + cEMin);
			System.out.print(CA);
			System.out.print("\t");
			System.out.print(CB);
			System.out.print("\t");
			System.out.print(CC);
			System.out.print("\t");
			System.out.print(CD);
			System.out.print("\t");
			System.out.println(CE);
//prints the first two rows
		}
		for (int i = 0; i< 1; i++) {
			int CA = (int)Math.floor(Math.random() * (cAMax - cAMin + 1) + cAMin);
			int CB = (int)Math.floor(Math.random() * (cBMax - cBMin + 1) + cBMin);
			int CD = (int)Math.floor(Math.random() * (cDMax - cDMin + 1) + cDMin);
			int CE = (int)Math.floor(Math.random() * (cEMax - cEMin + 1) + cEMin);
			System.out.print(CA);
			System.out.print("\t");
			System.out.print(CB);
			System.out.print("\t");
			System.out.print("FREE");
			System.out.print("\t");
			System.out.print(CD);
			System.out.print("\t");
			System.out.println(CE);
// prints the free space row
		}
		for (int i = 0; i< 2; i++) {
			int CA = (int)Math.floor(Math.random() * (cAMax - cAMin + 1) + cAMin);
			int CB = (int)Math.floor(Math.random() * (cBMax - cBMin + 1) + cBMin);
			int CC = (int)Math.floor(Math.random() * (cCMax - cCMin + 1) + cCMin);
			int CD = (int)Math.floor(Math.random() * (cDMax - cDMin + 1) + cDMin);
			int CE = (int)Math.floor(Math.random() * (cEMax - cEMin + 1) + cEMin);
			System.out.print(CA);
			System.out.print("\t");
			System.out.print(CB);
			System.out.print("\t");
			System.out.print(CC);
			System.out.print("\t");
			System.out.print(CD);
			System.out.print("\t");
			System.out.println(CE);
//prints the final row
		}
	}
}