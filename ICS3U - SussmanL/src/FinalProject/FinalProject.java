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
	static Console c = new Console(30, 100);
	static int pause = 1;
	public static void main(String[] args) throws InterruptedException {
		double money = 1000;
		ArrayList<String> deck;
		ArrayList<String> dealerHand = new ArrayList<>();
		ArrayList<String> playerHand = new ArrayList<>();
		
		boolean playAgain = true;
		c.println("Welcome to Blackjack!");
		c.println("In Blackjack, everyone plays against the dealer. \n"
				+ "Players receive all cards face up and the dealer's first card is face up and the second is face down. \n"
				+ "The object of the game is to get closer to 21 than the dealer without going over 21. \n"
				+ "If a hand goes over 21, it is called a “bust” or “break” and the wager is lost.\n");
		
		
		while (playAgain == true) {
		boolean betMade = false;
		deck = makeDeck();//getting a randomized deck
        Collections.shuffle(deck);
		printSlow("How much would you like to bet? (whole dollar ammounts please)", pause);
		printSlow("You currently have $" + money, pause);
		double bet = c.readDouble();

        
        
        
        while (betMade == true) {
		playerHand.add(deck.remove(0));//giving the player 2 cards
		playerHand.add(deck.remove(0));
		printSlow("Your hand is: " + playerHand.getFirst() + " and " + playerHand.getLast(), pause);
		dealerHand.add(deck.remove(0));//giving the dealer two cards but only one is shown
		dealerHand.add(deck.remove(0));
		printSlow("The dealer is showing: " + dealerHand.getFirst(), pause);
		
		
		
		
		
        }
            
            
            
            
            
            
            c.println("Do you want to play again?(Y/N)");
            String choice = c.readLine();
            if (choice.equalsIgnoreCase(choice)) {
            	playAgain = true;
            }else
            	playAgain = false;
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
		String[] ranks = {"1", "2","3","4","5", "6","7","8","9","10","Jack","Queen","King","Ace"};
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
	        int aces = 0;

	        for (String card : hand) {
	            String rank = card.split(" ")[0];
	            if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
	                value += 10;
	            } else if (rank.equals("Ace")) {
	                value += 11;
	                aces++;
	            } else {
	                value += Integer.parseInt(rank);
	            }
	        }
			return value;
}
	 public static int winner(ArrayList<String> playerHand,ArrayList<String> dealerHand) throws InterruptedException {
		 int winner;
		if(handValue(playerHand)>handValue(dealerHand) && handValue(playerHand) <= 21) {
			printSlow("YOU WIN!!", pause);
			winner = 2;
		}else if (handValue(playerHand)==handValue(dealerHand) && handValue(playerHand) <= 21) {
			printSlow("TIE!!! You keep your money, but do not gain anything", pause);
			winner = 1;
		}else {
			printSlow("You Lose", pause);
			winner = 0;
		}
		 return winner;
	 }
}
