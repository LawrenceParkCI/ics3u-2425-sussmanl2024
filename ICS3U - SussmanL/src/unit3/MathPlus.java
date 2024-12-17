package unit3;
import java.util.Scanner;
public class MathPlus {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		distance(12,1,15,75);
		hypotenuse(3,4);
		numOfFactors(17);
		isPrime(23);
	}

public static double distance( int x1, int y1, int x2, int y2 ) {
	System.out.println("" + (x1-x2) + ", " +(y1-y2));
	return 0;
	
}
public static double hypotenuse(double a, double b) {
	System.out.println(Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))));
	return 0;
}
public static int numOfFactors(int num) {
	int factors = 0;
		for (int i = 1; i <= num; i++) {
	        if (num % i == 0) {
	        	System.out.print(i + " ");
	        	 factors += 1;
	        }
	    }
		System.out.println();
		System.out.println(factors);
	return 0;
}
public static boolean isPrime(int num) {
	System.out.println("PRIME:");
	int numInput = 0;
	for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
        	
        	numInput += 1;
        }
    }
	boolean prime = false;
	if (numInput==2) {
		prime = true;
		System.out.println(prime);
	}else
	System.out.println(prime);
	return false;
}
}



