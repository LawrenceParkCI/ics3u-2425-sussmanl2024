package unit1;
/**
 * Description: This program finds the area for a rectangle<br>
 * Date: 2/10/2024 
 * @author Leo Sussman
 */
import java.util.Scanner;
public class RectangleArea {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int length, width, depth;
	
	System.out.println("AREA PROGRAM");
	System.out.println("Type in the length of the prism and <ENTER>");
	length = sc.nextInt();
	
	System.out.println("Type in the width of the prism and <ENTER>");
	width = sc.nextInt();
	
	System.out.println("Type in the depth of the prism and <ENTER>");
	depth = sc.nextInt();
	
	int area = length * width * depth;
	
	System.out.println("The area of your prism is " + area);
	sc.close();
	}

}
