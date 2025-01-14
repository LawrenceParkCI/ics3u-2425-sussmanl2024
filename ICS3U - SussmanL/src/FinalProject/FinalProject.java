package FinalProject;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import hsa_new.Console;
public class FinalProject {
	static Console c = new Console(100, 1000);
	static int pause = 1;
	public static void main(String[] args) throws InterruptedException {
		c.setTextColor(Color.BLACK);
		c.setTextBackgroundColor(Color.LIGHT_GRAY);
		c.clear();
		double money = 1000;
		boolean bust = false;
		double bet = 0;
		String choice;
		ArrayList<String> deck;
		ArrayList<String> dealerHand = new ArrayList<>();
		ArrayList<String> playerHand = new ArrayList<>();
		drawCard(playerHand, true);

		boolean playAgain = false;
		c.println("Welcome to Blackjack!");
		c.println("In Blackjack, you play against the dealer. \n"
				+ "Players receive all cards face up and the dealer's first card is face up and the second is face down. \n"
				+ "The object of the game is to get closer to 21 than the dealer without going over 21. \n"
				+ "If a hand goes over 21, it is called a “bust” or “break” and the wager is lost.\n");
		printSlow("Are you ready to play? (Y/N)", pause);
		choice = c.readLine();
		if (choice.equalsIgnoreCase("y")) {
			playAgain = true;
		}

		while (playAgain == true) {
			c.clear();
			playerHand.clear();
			dealerHand.clear();
			System.out.println(playerHand);
			boolean betMade = false;
			deck = makeDeck();//getting a randomized deck
			Collections.shuffle(deck);
			printSlow("How much would you like to bet? (whole dollar amounts please)", pause);
			if (money==0) {
				printSlow("You have no money. Sorry, but its game over now.", pause);
			}else {
				printSlow("You currently have $" + money, pause);
				bet = c.readDouble();
				if (bet<= money) {
					betMade = true;
					printSlow("You bet $" + bet, pause);
				}else {
					printSlow("That is not a valid bet", pause);
					Thread.sleep(1000);
				}
			}
			while (betMade == true) { // starting the turn
				playerHand.add(deck.remove(0));//giving the player 2 cards
				
				playerHand.add(deck.remove(0));
				printSlow("Your hand is: " + playerHand.getFirst() + " and " + playerHand.getLast(), pause);
				printSlow("The value of your hand is " + handValue(playerHand), pause);
				dealerHand.add(deck.remove(0));//giving the dealer two cards but only one is shown
				dealerHand.add(deck.remove(0));
				printSlow("The dealer is showing: " + dealerHand.getFirst(), pause);


				if (handValue(playerHand) == 21) {//auto win if you start with blacjack
					System.out.println("Blackjack! You win!");
				}else if (handValue(playerHand) < 21){ //all other times you get to hit or stand
					printSlow("Do you want to hit or stand", pause);
					choice = c.readLine();
					if(choice.equalsIgnoreCase("hit")) {//if you hit
						playerHand.add(deck.remove(0));
						printSlow("You get drawn the " + playerHand.getLast(), pause);
						printSlow("The value of your hand is now " + handValue(playerHand), pause);
						printSlow("Do you want to hit or stand", pause);
						choice = c.readLine();
						while (!choice.equalsIgnoreCase("stand") && bust!=true) {//loops doing hit and hit again until you choose stand
							if (handValue(playerHand) <= 21) {
								playerHand.add(deck.remove(0));
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

	}









	public static void printSlow (String str, double pause) throws InterruptedException {
		for (int i = 1; i < str.length() + 1; i++) { 
			c.print(str.substring(i - 1, i));
			Thread.sleep((long) pause);
		}
		c.println();
	}
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
	public static int handValue(ArrayList<String> hand) {
		int value = 0;
		boolean hasAce = false;
		for (String card : hand) {
			hasAce = false;
			String rank = card.split(" ")[0];
			if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
				value += 10;
			} else if (rank.equals("Ace")) {
				value += 1;
				hasAce = true;
				if (hasAce=true && value <12) {
					value += 10;
					hasAce=false;
				}
			} else {
				value += Integer.parseInt(rank);
			}

		}

		return value;
	}



	public static double winner(ArrayList<String> playerHand,ArrayList<String> dealerHand, double bet, double money) throws InterruptedException {
		if(handValue(playerHand)>handValue(dealerHand) && handValue(playerHand) <= 21) {
			printSlow("YOU WIN!!", pause);
			money = money+bet;
		}else if (handValue(playerHand)==handValue(dealerHand) && handValue(playerHand) <= 21) {
			printSlow("TIE! You keep your money, but do not gain anything", pause);

		}else if ((handValue(playerHand)<handValue(dealerHand) || handValue(playerHand) > 21)){
			printSlow("You Lose", pause);
			money = money-bet;

		}
		return money;
	}
	public static int dealerTurn(ArrayList<String> dealerHand, ArrayList<String> deck) throws InterruptedException{
		printSlow("The dealer shows " + dealerHand.getLast(), pause);
		while(handValue(dealerHand) < 17) {
			Thread.sleep(1000);
			dealerHand.add(deck.remove(0));
			printSlow("The dealer draws the " + dealerHand.getLast(), pause);
		}
		if(handValue(dealerHand) > 21) {
			printSlow("The dealer busts", pause);
		}else {
			printSlow("The dealer stands on " + handValue(dealerHand), pause);
		}
		return handValue(dealerHand);

	}
	public static void drawCard(ArrayList<String> hand, boolean player) throws InterruptedException{
		int dealerXPoint = 600;
		int dealerYPoint = 100;
		int playerXPoint = 600;
		int playerYPoint = 10;
		if (player == true) {
			c.setColor(Color.WHITE);
		c.fillRect(playerXPoint,playerYPoint , 100, 200);
		playerXPoint += 30;
		}else {
			c.fillRect(dealerXPoint,dealerYPoint , 100, 150);
		dealerXPoint += 30;
		}
		
	}
}
