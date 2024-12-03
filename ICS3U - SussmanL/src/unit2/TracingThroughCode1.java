package unit2;

import java.util.Scanner;

/**
Name: Leo Sussman
Date: Nov 28, 2024
Description: Tracing through code
*/
public class TracingThroughCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int num = 0;
    String word = "Que";

    while (num < 15) {
      System.out.println(word);
      num = num + 1;
    }
    word = word + word;
    while (num > 0) {
      System.out.println(word);
      num = num - 1;
      sc.close();
    }
  }
}
