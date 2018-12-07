
import java.util.Scanner;

/**
 * This class prompts the user to enter values for numy and numx. The while loop
 * will continue until numy = numx.
 * 
 * @author Gianni
 *
 */
public class WhileLoops {

	public static void main() {
		System.out.println("_____While Loops_____");
		System.out.println("While loops will allow the same block of code to run until");
		System.out.println("a specified condition is met.");
		System.out.println();
		System.out.println("If we were to set variable x = 1, and create a while loop");
		System.out.println("that says: continue looping until x = 10.");
		System.out.println("We would need to offer the loop a way out, possibly by");
		System.out.println("incrementing x by 1 every time.");
		System.out.println();

		System.out.println("Pick a large value you would like x to reach:");
		Scanner in2 = new Scanner(System.in);
		int numy = in2.nextInt();
		System.out.println("Now pick a smaller value for x:");
		Scanner in = new Scanner(System.in);
		int numx = in.nextInt();

		while (numx < numy) {
			numx++;
			System.out.println(numx);
		}
		System.out.println("For every number you see, our while loop ran.");
		System.out.println();

	}

}