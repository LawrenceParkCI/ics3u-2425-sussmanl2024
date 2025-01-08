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
	static Console c = new Console(30, 175);
	public static void main(String[] args) {
		int money = 1000;
		 ArrayList<String> deck;
		boolean playAgain = true;
		
		deck = initializeDeck();
        Collections.shuffle(deck);
		System.out.println(deck);
		
		System.out.println("Welcome to Blackjack!");
		System.out.println("In Blackjack, everyone plays against the dealer. \n"
				+ "Players receive all cards face up and the dealer's first card is face up and the second is face down. \n"
				+ "The object of the game is to get closer to 21 than the dealer without going over 21. \n"
				+ "If a hand goes over 21, it is called a “bust” or “break” and the wager is lost.\n");

		
		
        ArrayList<ArrayList<String>> playerHand = new ArrayList<>();
            playerHand.add(new ArrayList<>());
            
            
            
            
            
        }


	
	public static void printSlow (String str, double pause) throws InterruptedException {
		for (int i = 1; i < str.length() + 1; i++) { 
			System.out.print(str.substring(i - 1, i));
			Thread.sleep((long) pause);

		}
		System.out.println();
	}
	public static ArrayList <String> initializeDeck(){
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
	
}
