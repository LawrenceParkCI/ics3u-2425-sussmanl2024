package unit2;

import java.util.Scanner;

/**
Description:
Date:
@author:
*/

public class DNAStringChallenge {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
System.out.println("What is the sequence?");
String DNASequence = sc.nextLine();

char charA = 'A';
int countA = 0;
 
for (int a = 0; a < DNASequence.length(); a++) {
    if (DNASequence.charAt(a) == charA) {
        countA++;
    }
}

char charC = 'C';
int countC = 0;
 
for (int c = 0; c < DNASequence.length(); c++) {
    if (DNASequence.charAt(c) == charC) {
        countC++;
    }
}


char charG = 'G';
int countG = 0;
 
for (int g = 0; g < DNASequence.length(); g++) {
    if (DNASequence.charAt(g) == charG) {
        countG++;
    }
}


char charT = 'T';
int countT = 0;
 
for (int t = 0; t < DNASequence.length(); t++) {
    if (DNASequence.charAt(t) == charT) {
        countT++;
    }
}

System.out.println("There are " + countA + " A");
System.out.println("There are " + countC + " C");
System.out.println("There are " + countG + " G");
System.out.println("There are " + countT + " T");

    /**
      http://rosalind.info/problems/dna/
    */
sc.close();
  }
}