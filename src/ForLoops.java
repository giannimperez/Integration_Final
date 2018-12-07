
import java.util.Scanner;

/**
 * This class includes a for loop which executes until a user specified number
 * of times.
 * 
 * @author Gianni Perez
 **/
public class ForLoops {

	public static void main() {
		System.out.println("_____For Loops_____");
		System.out.println("For loops are very useful when you know how many");
		System.out.println("times you want a block of code to be executed.");
		System.out.println("You do so by entering its start and end values,");
		System.out.println("then deciding how to increment it.");
		System.out.println();

		System.out.println("Example:");
		System.out.println("Enter the amount of times you would like the loop to take place:");
		Scanner in = new Scanner(System.in);
		int stop = in.nextInt();
		System.out.println();
		int start;

		for (start = 1; start < stop + 1; start++) {
			System.out.println("Loopdy Loop!");
		}
		System.out.println();
	}

}