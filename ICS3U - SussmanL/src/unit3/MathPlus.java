package unit3;
import java.util.Scanner;
public class MathPlus {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println(distance(12,1,15,75));
		System.out.println(hypotenuse(3,4));
		System.out.println(numOfFactors(17));
		System.out.println(isPrime(23));
		int [] intarray = {1, 5, 6,4};
		System.out.println(sum(intarray));
		double [] doubleArray = {1.3, 5, 6,4};
		System.out.println(sum(doubleArray));
		int [] min = {1, 5, 6, 4, -17, -12, 2, 17};
		System.out.println(min(min));
		int [] max = {12313123, 5, 6,4, -1231243, 0, -1, 17};
		System.out.println(max(max));
		int [] doubleMin = {1, 5, 6, 4, -17, -12, 2, 17};
		System.out.println(min(doubleMin));
		int [] doubleMax = {1, 12313, 6, 4, -17, -12, 2, 17};
		System.out.println(max(doubleMax));
	}
	/**
	 * gets the distance value for two distances
	 * @param x1 the first x value
	 * @param y1 the first y value
	 * @param x2 the second x value
	 * @param y2 the second y value
	 * @return the distance between x and y
	 */
	public static double distance( int x1, int y1, int x2, int y2 ) {
		return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

	}
	/**
	 * gets the hypotenuse of a rectangle
	 * @param a the first side
	 * @param b the second side
	 * @return the last side length
	 */
	public static double hypotenuse(double a, double b) {
		return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
	}
	/**
	 * gets the number of factors that a number has
	 * @param num the number that is being tested
	 * @return the number of factors
	 */
	public static int numOfFactors(int num) {
		int factors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors += 1;
			}
		}
		return factors;
	}
	/**
	 * finds if a number is prime or not
	 * @param num the number that is being tested
	 * @return true if prime false if not
	 */
	public static boolean isPrime(int num) {

		if (numOfFactors(num)==2) {
			return true;
		}else
			return false;
	}
	public static int sum (int[] x) {
		int sum = 0;
		int numOfNums = x.length;
		for (int i = 0; i < numOfNums; i++) {
			sum += x[i];
		}
		return sum;
	}
	public static double sum (double[] x) {
		double sum = 0;
		int numOfNums = x.length;
		for (int i = 0; i < numOfNums; i++) {
			sum += x[i];
		}
		return sum;
}
	public static int min (int[] x) {
		int min = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[min] > x[i]) {
				min = i;
			}
				}
		return min;
	}
	public static double min (double[] x) {
		int min = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[min] > x[i]) {
				min = i;
			}
				}
		return min;
	}
	public static int max (int[] x) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[max] < x[i]) {
				max = i;
			}
				}
		return max;
	}
	public static double max (double[] x) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[max] < x[i]) {
				max = i;
			}
				}
		return max;
	}

}



