
import java.util.Scanner;

/**
 * This class prompts the user to enter two ints. The ints are then added using
 * +=.
 * 
 * @author Gianni
 *
 */
public class PlusEquals {

	public static void main() {
		System.out.println("_____Plus Equals_____");
		System.out.println("+= is a common shorthand for adding two values.");
		System.out.println("Suppose you wanted to write: x=x+y.");
		System.out.println("You could alternatively write: x+=y.");
		System.out.println();
		System.out.println("The same would apply for x=x-y.");
		System.out.println("You could alternatively write: x-=y.");
		System.out.println();

		System.out.println("Example:");
		System.out.println("Enter a value for x:");
		Scanner in = new Scanner(System.in);
		int numx = in.nextInt();
		System.out.println("Enter a value for y:");
		Scanner in2 = new Scanner(System.in);
		int numy = in.nextInt();
		System.out.println(in2);

		System.out.println(numx + " += " + numy + " would return " + (numx += numy));
		System.out.println();
	}

}
