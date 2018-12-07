
import java.util.Scanner;

/**
 * The DoWHileLoops class includes a basic Do/While loop that prompts the user
 * to enter a value for int x, and increments until it reaches 20.
 * 
 * @author Gianni Perez
 **/
public class DoWhileLoops {

	public static void main() {
		System.out.println("_____Do/While Loops_____");
		System.out.println("Do/While loops are used to execute a block of code repeatedly");
		System.out.println("until a set condition is met.");
		System.out.println();
		System.out.println("In this example our variable x is assigned any number, and");
		System.out.println("the loop will continue to add 1 until the variable x is assigned");
		System.out.println("the number 20.");
		System.out.println();
		System.out.println("Enter a value for x, between 1 and 20:");

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		do {
			System.out.println(x);
			x++;
		} while (x <= 20);
		System.out.println();
	}

}
