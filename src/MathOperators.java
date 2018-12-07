
import java.util.Scanner;

/**
 * This class prompts the user to enter ints num1 and num2, which are then
 * summed, subtracted, multiplied, divided and the remainder found.
 * 
 * @author Gianni
 *
 */
public class MathOperators {

	public static void main() {
		System.out.println("_____Math Operators_____");
		System.out.println("Basic Operators:");
		System.out.println("+ : Adds two values.");
		System.out.println("- : Subtracts a value from another.");
		System.out.println("* : Multiplies two values.");
		System.out.println("/ : Divides a value by another.");
		System.out.println("% : Finds the remainder of two values divided.");
		System.out.println("     ^useful for checking that values will divide evenly");
		System.out.println();

		System.out.println("Enter an int:");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println("Enter another int:");
		Scanner in2 = new Scanner(System.in);
		int num2 = in2.nextInt();

		System.out.println("The sum of your values is: " + (num1 + num2));
		System.out.println("The difference of your values is: " + (num1 - num2));
		System.out.println("The product of your values is: " + (num1 * num2));
		System.out.println("The quotient of your values is: " + (num1 / num2));
		System.out.println("The remainder of your values is: " + (num1 % num2));
		System.out.println();
	}
}