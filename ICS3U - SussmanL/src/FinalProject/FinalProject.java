package FinalProject;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import hsa_new.Console;
/**
 * This program allows you to play blackjack against an bot dealer, and win or lose fake money
 * You start off by choosing the amount of money you would like to bet, and then getting your cards dealt
 * Your cards will be drawn on the screen, along with the dealer's cards, though the dealer will have 1 card hidden from the player
 * You can than choose to hit(draw another card), stand (keep your current cards) or double down. When you double down you just draw  one more card (then you are forced to stand) and double your bet amount.
 * It will then go through the dealer's turn, where he will reveal his hidden card. In normal black jack the dealer always hits at 16 or lower and stands at 17 or higher.
 * In my version, just for fun the dealer will randomly hit only 60% of the time when it has 16.
 * If the dealer busts (goes over 21), then you win. If the dealer has a lower value than you, you win. If the dealer beats your value or you bust then the dealer wins.
 * If you win you double the money you bet, if you tie then you just get your bet back, if you lose the dealer takes your money.
 * If you are out of money the game ends, if you aren't you can play again and your money will be updated accordingly.
 * January 15, 2024
 * 
 * @author Leo Sussman
 */
public class FinalProject {
	static Console c = new Console(50, 150);
	static int pause = 20;//the pause while printing
	static ArrayList<String> deck;//the deck of cards
	static ArrayList<String> dealerHand = new ArrayList<>();//the dealers hand
	static ArrayList<String> playerHand = new ArrayList<>();//the players hand

	/**
	 * The main method that runs the program in a loop, until you loose all your money or choose to stop
	 * It allows you to choose your moves and bet money, and then it tells you if you win or not.
	 * The loop will continue to another hand after it finishes
	 * 
	 * @param args Unused
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		c.setTextBackgroundColor(Color.LIGHT_GRAY);//sets background color
		c.clear();
		double money = 1000; //starting money
		double bet = 0;
		String choice;
		//Uncomment to run tests
		//runTests(); 

		
		boolean playAgain = false; //used to decide to play the next hand
		
		c.println("Welcome to Blackjack!");//rules of blackjack and an intro
		c.println("In Blackjack, you play against the dealer. \n"
				+ "Players receive all cards face up and the dealer's first card is face up and the second is face down. \n"
				+ "The object of the game is to get closer to 21 than the dealer without going over 21. \n"
				+ "If a hand goes over 21, it is called a “bust” or “break” and the wager is lost.\n");
		printSlow("Are you ready to play? (Y/N)", pause);
		choice = c.readLine(); //get the person's choice
		if (choice.equalsIgnoreCase("y")) {
			playAgain = true;
		}

		while (playAgain == true && money >0) {
			
			//Clears the screen and all the variables
			c.clear();
			playerHand.clear();
			dealerHand.clear();


			deck = makeDeck();//makes a new deck
			Collections.shuffle(deck); //shuffles the deck 

			printSlow("How much would you like to bet? (whole dollar amounts please)", pause);
			printSlow("You currently have $" + money, pause);
			
			boolean betMade = false; //did they place a valid bet
			bet = c.readDouble();
			
			//Player can only bet the money they have
			if (bet<= money) {
				betMade = true;
				printSlow("You bet $" + bet, pause);
			}else {
				printSlow("That is not a valid bet", pause);
				Thread.sleep(1000);
			}
			if (betMade == true) { // starting the turn
				boolean bust = false; // If you bust you lose automatically and the dealer doesn't play
				//cards are removed from the start of the deck at index 0 and added to the end of the player's or dealer's hand
				playerHand.add(deck.remove(0));//giving the player 2 cards
				playerHand.add(deck.remove(0));
				dealerHand.add(deck.remove(0));//giving the dealer two cards but only one is shown
				dealerHand.add(deck.remove(0));
				drawImages(true); //draw images true hides the dealers hidden card
				printSlow("Your hand is: " + playerHand.getFirst() + " and " + playerHand.getLast(), pause);
				printSlow("The value of your hand is " + handValue(playerHand), pause);
				printSlow("The dealer is showing: " + dealerHand.getLast(), pause);


				if (handValue(playerHand) == 21) {//auto stand if you start with blackjack
					printSlow("Blackjack! You stand!", pause);
					Thread.sleep(1000);
				}else if (handValue(playerHand) < 21){ //all other times you get to hit or stand or double down
					printSlow("Do you want to hit, stand or double down", pause);
					choice = c.readLine();
					if (choice.equalsIgnoreCase("Double Down") && bet <= money/2) { //if you can double down it will let you, otherwise it will make you hit or stand
						bet += bet; //Double their bet
						playerHand.add(deck.remove(0)); //draw one last card
						drawImages(true);
						printSlow("You choose to double down", pause);
						printSlow("You get drawn the " + playerHand.getLast(), pause);
						if (handValue(playerHand)<22) {
							printSlow("The value of your hand is now " + handValue(playerHand), pause);
							Thread.sleep(1000);
						}else {
							printSlow("YOU BUST! ROUND OVER", pause);
							bust = true;
						}
					}else if (bet > money/2 && choice.equalsIgnoreCase("Double Down")) { //Not enough money to double down, give the option to hit or stand
						printSlow("You can't double down", pause);
						printSlow("Do you want to hit or stand", pause);
						choice = c.readLine();
					}
					if(choice.equalsIgnoreCase("hit")) {//if you hit
						playerHand.add(deck.remove(0));
						drawImages(true);//draw the image of your new card		
						printSlow("You get drawn the " + playerHand.getLast(), pause);
						printSlow("The value of your hand is now " + handValue(playerHand), pause);
						if (handValue(playerHand) > 21) {//if you hit over 21 then you bust
							printSlow("YOU BUST. ROUND OVER", pause);
							bust = true;
						}else {
							printSlow("Do you want to hit or stand", pause);//value under 21 you can choose again
							choice = c.readLine();
						}
						while (!choice.equalsIgnoreCase("stand") && bust!=true) {//loops doing hit and hit again until you choose stand
							if (handValue(playerHand) <= 21) {
								playerHand.add(deck.remove(0));
								drawImages(true);					
								printSlow("You get drawn the " + playerHand.getLast(), pause);
								printSlow("The value of your hand is " + handValue(playerHand), pause);
								if (handValue(playerHand) > 21) {//if you hit over 21 then you bust
									printSlow("YOU BUST. ROUND OVER", pause);
									bust = true;
								}else {
									printSlow("Do you want to hit or stand", pause);//value under 21 you can choose again
									choice = c.readLine();
								}
							}else {//if they hit too much, they bust and it ends their turn
								printSlow("YOU BUST. ROUND OVER", pause);
								bust = true;
							}
						}
					}
				}

				if (bust == false) {//if you didn't bust then you see who won
					printSlow("You stand on " + handValue(playerHand), pause);
					Thread.sleep(800);
					dealerTurn(dealerHand,deck);
				}


				money = winner(playerHand, dealerHand, bet, money);//gives you your money now
				printSlow("You now have $" + money, pause);
				betMade = false;
				c.println("Do you want to play again?(Y/N)");//ask if they want to play another round
				choice = c.readLine();
				if (choice.equalsIgnoreCase("Y")) {
					playAgain = true;
				}else
					playAgain = false; 
			}
		}
		if (money==0) {
			printSlow("You have no money. Sorry, but its game over now.", pause);//you can't play anymore
			Thread.sleep(4000);
			c.close();
		}else {
			printSlow("Thanks for playing!", pause);//if you choose to quit then it says thanks
			Thread.sleep(4000);
			c.close();
		}

	}    

	/**
	 * This makes the text print out slowly, to make it look cool
	 * @param str String, will be the words they want to get typed
	 * @param  pause Double, will be the pause in between each character typed
	 * @throws InterruptedException
	 */
	public static void printSlow (String str, double pause) throws InterruptedException {
		
		for (int i = 1; i < str.length() + 1; i++) { //a for loop that prints out text character by character
			c.print(str.substring(i - 1, i));
			Thread.sleep((long) pause);
		}
		c.println();
	}
	
	
	/**
	 * 
	 * Returns a new array list with every possible combination between these the two array of ranks and suits (52 possibilities, so 52 cards)
	 */
	public static ArrayList <String> makeDeck(){
		
		String[] suits = {"Diamonds", "Hearts","Clubs","Spades"};
		String[] ranks = {"2", "3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		ArrayList <String> deck = new ArrayList<>();
		for(String suit: suits) {
			for(String rank: ranks) {
				deck.add(rank + " of " + suit);
			}
		} 
		return deck;
	}



	/**
	 * Gets the value of the cards in your hand.
	 * Face cards and tens are worth 10.
	 * Number cards are worth their number
	 * Aces are worth 1 but if they can be worth 11 without busting (going over 21) they will be worth 11
	 * 
	 * @param hand ArrayList<String>,will be the hand they want to get calculated
	 */
	public static int handValue(ArrayList<String> hand) {
		
		int value = 0;// calculates the value of a hand, starts off at 0
		boolean hasAce = false;//sees if an ace has been dealt to the hand
		for (String card : hand) {
			//Split the name of the card into words and grabs the first word
			//e.g. 5 of Spades becomes 5 or King of Hearts becomes King
			String rank = card.split(" ")[0]; 
			if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
				value += 10;//if the card starts in jack, queen or king then it gives the value of 10
			} else if (rank.equals("Ace")) {
				value += 1;//ace start value is 1
				hasAce = true;

			} else {
				value += Integer.parseInt(rank);//it parseInts the number cards to get the value
			} 

		}
		if (hasAce==true && value <12) {
			value += 10;//if the value is less than 12 and there is at least 1 ace then it adds 10 to the value
		}

		return value;
	}


	
	public static int dealerTurn(ArrayList<String> dealerHand, ArrayList<String> deck) throws InterruptedException{
		/**
		 * The dealers turn, decides if the dealer hits or not. Also sees if the dealer busts, and if so then the player wins.
		 * @param deck ArrayList<String>,if the dealer hits it will remove a card from the deck and add it to the dealers hand
		 * @param dealerHand ArrayList<String>,will update the hand if they hit or not. It is also used to see the value of the hand.
		 * @throws InterruptedException
		 */
		drawImages(false);//draw images false makes it so it shows all the cards, this is the only time it happens
		printSlow("The dealer shows the " + dealerHand.getFirst(), pause);
		Thread.sleep(1500);//dealer shows his hidden card

		//if it is under 16 the dealer hits or if it is equal to 16 then the dealer will hit 60% of the time
		while(handValue(dealerHand) < 16 || (handValue(dealerHand) == 16 && (Math.random()<0.6))) {	
			dealerHand.add(deck.remove(0));
			drawImages(false);
			printSlow("The dealer draws the " + dealerHand.getLast(), pause);
			Thread.sleep(750);
		}
		if(handValue(dealerHand) > 21) {//if the dealer busts then he loses
			printSlow("The dealer busts", pause);
		}else {//the dealer can stand on values >=16
			printSlow("The dealer stands on " + handValue(dealerHand), pause);
		}
		return handValue(dealerHand);

	}
	
	/**
	 * Decides who wins by comparing hands, and then updates the money accordingly
	 * @param playerHand ArrayList<String>,will be compared to dealerHand to see who won
	 * @param dealerHand ArrayList<String>,will be compared to player Hand to see who won
	 * @param bet Double, will be added or subtracted from your money based on if you win or not	
	 * @param money Double, will be added or subtracted from your money based on if you win or not	 
	 * @throws InterruptedException
	 */
	public static double winner(ArrayList<String> playerHand,ArrayList<String> dealerHand, double bet, double money) throws InterruptedException {
		
		//all the ways to win
		//Player hand more than dealer hand but less than 21 or dealer hand busted (more than 21)
		if((handValue(playerHand)>handValue(dealerHand) && handValue(playerHand) <= 21) || handValue(dealerHand)>21) {
			printSlow("YOU WIN!!", pause);
			money = money+bet;//gives you your start money plus the amount you bet
		}else if (handValue(playerHand)==handValue(dealerHand) && handValue(playerHand) <= 21) { // Tied but not busted
			printSlow("TIE! You keep your money, but do not gain anything", pause);
			//nothing happens in a tie
		}else if ((handValue(playerHand)<handValue(dealerHand) || handValue(playerHand) > 21)){//all the ways to lose - player less than dealer or player busted
			printSlow("You Lose", pause);
			money = money-bet;//you lose your bet amount

		}
		return money;
	}
	
	

	
	/**
	 * Draws the images of the cards in the players hand
	 * The images are from https://code.google.com/archive/p/vector-playing-cards
	 * Thank you for putting these card images in the public domain
	 * 
	 * @param hand ArrayList<String>,Whichever hand is to be printed out
	 * @param player boolean, will decide if it is the players hand or the dealers hand	
	 * @param dealerHide boolean, decides if the card will be hidden (what the dealer has at the start of the game)	 
	 */
	public static void drawCardImages(ArrayList<String> hand, boolean player, boolean dealerHide) throws InterruptedException{
		
		for(int i = 0; i < hand.size(); i++) {//loops through all the cards in the hand

			String cardName = hand.get(i);//sets card to the name of the last card in hand
			BufferedImage card=null;
			try {

				cardName = cardName.replace(" ", "_");//replaces the space in the card name for a _ because that is how the file looks
				if (player == false && dealerHide==true && i==0) {//if it is the dealers card face down, it makes the card show the back of the card image
					cardName = "cardBack";
				}else{
					cardName = cardName.replace(" ", "_");
				}
				card = ImageIO.read(new File("src/pics/" + cardName + ".png"));//it will draw the most recent card drawn

			} catch (IOException e) {
				e.printStackTrace();
				System.out.print(cardName);//if it is an error it will print out the last
			}
			int x = 100;
			int y = 300; //The y for the dealer's cards
			if (player == true) {
				y = 550;//if it is the players cards then they are lower in the console
			}
			x += (i - 1)*75;//moves the cards over based every card that is dealt
			c.drawImage(card, x, y, 150, 219, c);//draws the image in the console

		}
	}
	

	/**
	 * Whenever it draws cards, it clears the screen then will draw both the hands again, because the text background can cut into it, so it makes it look better
	 * @param dealerHide boolean, when the cards are being redrawn, just need to see if the card will be hidden (same as dealerHide in drawCard)
	 * @throws InterruptedException
	 */
	public static void drawImages(boolean dealerHide) throws InterruptedException{

		c.clear();
		drawCardImages(playerHand, true, false); // player's cards
		drawCardImages(dealerHand, false, dealerHide); //dealer's cards

	}

	/**
	 * Makes test hands to we can check different scenarios. Otherwise it is difficult to get a random hand with that scenario
	 * Not part of the program but it was helpful
	 * Works well for handValue() and winner()
	 * @return true if all the tests pass
	 */
	public static boolean runTests(){
		boolean pass = true;
		ArrayList<String> hand = new ArrayList<String>();
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades"); 
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");
		hand.addLast("Ace of Spades");

		c.print(handValue(hand));
		pass = pass && handValue(hand) == 12;

		hand = new ArrayList<String>();
		hand.addLast("Ace of Spades");
		hand.addLast("King of Spades");
		hand.addLast("Ace of Spades");
		c.print(handValue(hand));
		pass = pass && handValue(hand) == 12;

		hand = new ArrayList<String>();
		hand.addLast("Ace of Spades");
		hand.addLast("7 of Spades");
		hand.addLast("King of Spades");

		c.print(handValue(hand));
		pass = pass && handValue(hand) == 18;

		return pass;
	}

}
