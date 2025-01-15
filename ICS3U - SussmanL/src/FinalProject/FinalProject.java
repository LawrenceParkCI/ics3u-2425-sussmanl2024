package FinalProject;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import hsa_new.Console;
public class FinalProject {
	static Console c = new Console(50, 150);
	static int pause = 1;//the pause while printing
	static ArrayList<String> deck;//the deck of cards
	static ArrayList<String> dealerHand = new ArrayList<>();//the dealers hand
	static ArrayList<String> playerHand = new ArrayList<>();//the players hand
	public static void main(String[] args) throws InterruptedException {
		c.setTextBackgroundColor(Color.LIGHT_GRAY);//sets background colour
		c.clear();
		double money = 1000;
		boolean bust = false;
		double bet = 0;
		String choice;


		boolean playAgain = false;
		c.println("Welcome to Blackjack!");//rules of blackjack and an intro
		c.println("In Blackjack, you play against the dealer. \n"
				+ "Players receive all cards face up and the dealer's first card is face up and the second is face down. \n"
				+ "The object of the game is to get closer to 21 than the dealer without going over 21. \n"
				+ "If a hand goes over 21, it is called a “bust” or “break” and the wager is lost.\n");
		printSlow("Are you ready to play? (Y/N)", pause);
		choice = c.readLine();
		if (choice.equalsIgnoreCase("y")) {
			playAgain = true;
		}



		while (playAgain == true && money >0) {
			c.clear();
			playerHand.clear();
			dealerHand.clear();

			boolean betMade = false;
			deck = makeDeck();//getting a randomized deck
			Collections.shuffle(deck);

			printSlow("How much would you like to bet? (whole dollar amounts please)", pause);
			printSlow("You currently have $" + money, pause);

			bet = c.readDouble();
			if (bet<= money) {
				betMade = true;
				printSlow("You bet $" + bet, pause);
			}else {
				printSlow("That is not a valid bet", pause);
				Thread.sleep(1000);
			}
			if (betMade == true) { // starting the turn
				playerHand.add(deck.remove(0));//giving the player 2 cards
				playerHand.add(deck.remove(0));
				drawImages(true);//draw images true hides the dealers hidden card
				dealerHand.add(deck.remove(0));//giving the dealer two cards but only one is shown
				dealerHand.add(deck.remove(0));
				drawImages(true);
				printSlow("Your hand is: " + playerHand.getFirst() + " and " + playerHand.getLast(), pause);
				printSlow("The value of your hand is " + handValue(playerHand), pause);
				printSlow("The dealer is showing: " + dealerHand.getLast(), pause);


				if (handValue(playerHand) == 21) {//auto win if you start with blackjack
					printSlow("Blackjack! You win!", pause);
					Thread.sleep(1000);
				}else if (handValue(playerHand) < 21){ //all other times you get to hit or stand or double down
					printSlow("Do you want to hit, stand or double down", pause);
					choice = c.readLine();
					if (choice.equalsIgnoreCase("Double Down") && bet <= money/2) { //if you can double down it will let you, otherwise it will make you hit or stand
						bet += bet;
						playerHand.add(deck.remove(0));
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
					}else if (bet > money/2 && choice.equalsIgnoreCase("Double Down")) {
						printSlow("You can't double down", pause);
						printSlow("Do you want to hit or stand", pause);
						choice = c.readLine();
					}
					if(choice.equalsIgnoreCase("hit")) {//if you hit
						playerHand.add(deck.remove(0));
						drawImages(true);			//draws your new card		
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
								drawCard(playerHand, true, false);
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
					Thread.sleep(500);
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

		}else {
			printSlow("Thanks for playing!", pause);//if you choose to quit then it says thanks

		}

	}









	public static void printSlow (String str, double pause) throws InterruptedException {
		for (int i = 1; i < str.length() + 1; i++) { //a for loop that prints out text character by character
			c.print(str.substring(i - 1, i));
			Thread.sleep((long) pause);
		}
		c.println();
	}
	public static ArrayList <String> makeDeck(){//makes a new array list with every possible combination between these two arrays
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
	public static int handValue(ArrayList<String> hand) {
		int value = 0;// calculates the value of a hand, starts off at 0
		boolean hasAce = false;//sees if an ace has been dealt to the hand
		for (String card : hand) {
			hasAce = false;
			String rank = card.split(" ")[0];
			if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
				value += 10;//if the card starts in jack, queen or king then it gives the value of 10
			} else if (rank.equals("Ace")) {
				value += 1;//ace start value is 1
				hasAce = true;
				if (hasAce=true && value <12) {
					value += 10;//if the value is less than 12 and there is at least 1 ace then it adds 10 to the value
					hasAce=false;
				}
			} else {
				value += Integer.parseInt(rank);//it parseInts the number cards to get the value
			}

		}

		return value;
	}



	public static double winner(ArrayList<String> playerHand,ArrayList<String> dealerHand, double bet, double money) throws InterruptedException {
		if((handValue(playerHand)>handValue(dealerHand) && handValue(playerHand) <= 21) || handValue(dealerHand)>21) {//all the ways to win
			printSlow("YOU WIN!!", pause);
			money = money+bet;//gives you your start money plus the amount you bet
		}else if (handValue(playerHand)==handValue(dealerHand) && handValue(playerHand) <= 21) {
			printSlow("TIE! You keep your money, but do not gain anything", pause);
			//nothing happens in a tie
		}else if ((handValue(playerHand)<handValue(dealerHand) || handValue(playerHand) > 21)){//all the ways to lose
			printSlow("You Lose", pause);
			money = money-bet;//you lose your bet amount

		}
		return money;
	}
	public static int dealerTurn(ArrayList<String> dealerHand, ArrayList<String> deck) throws InterruptedException{
		drawImages(false);//draw images false makes it so it shows all the cards, this is the only time it happens
		printSlow("The dealer shows the " + dealerHand.getFirst(), pause);
		Thread.sleep(1500);//dealer shows his hidden card

		while(handValue(dealerHand) < 16) {//if it is under 16 the dealer hits
			dealerHand.add(deck.remove(0));
			drawImages(false);
			printSlow("The dealer draws the " + dealerHand.getLast(), pause);
			Thread.sleep(750);
		}if (handValue(dealerHand) == 16) {//if it is equal to 16 then the dealer will hit 40% of the time
			if (Math.random()>0.6) {
				dealerHand.add(deck.remove(0));
				drawImages(false);
				printSlow("The dealer draws the " + dealerHand.getLast(), pause);
			}
		}
		if(handValue(dealerHand) > 21) {//if the dealer busts then he loses
			printSlow("The dealer busts", pause);
		}else {//the dealer can stand on values >=16
			printSlow("The dealer stands on " + handValue(dealerHand), pause);
		}
		return handValue(dealerHand);

	}
	public static void drawCard(ArrayList<String> hand, boolean player, boolean dealerHide) throws InterruptedException{
		for(int i = 0; i < hand.size(); i++) {//loops through all the cards in the hand

			String cardName = hand.get(i);//sets card to the name of the last card in hand
			BufferedImage card=null;//https://code.google.com/archive/p/vector-playing-cards/  Thank you for putting these card images in the public domain
			try {

				cardName = cardName.replace(" ", "_");//replaces the space in the card name for a _ because that is how the file looks
				if (player == false && dealerHide==true && i==0) {//if it is the dealers card face down, it makes the card show the back of te card image
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
			int y = 300;
			if (player == true) {
				y = 550;//if it is the players cards then they are lower
			}
			x += (i - 1)*75;//moves the cards over based every card that is dealt
			c.drawImage(card, x, y, 150, 219, c);//draws all the cards

		}
	}
	public static void drawImages(boolean dealerHide) throws InterruptedException{
		c.clear();//whenever it draws cards, it clears the screen then will draw both the hands again, because the text background can cut into it, so it makes it look better
		drawCard(playerHand, true, false);
		drawCard(dealerHand, false, dealerHide);

	}

}

