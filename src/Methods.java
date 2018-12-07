
import java.util.Scanner;

/**
 * This class exemplifies a basic method which prompts the user to enter values
 * for num1 and num2, which are then multiplied.
 * 
 * @author Gianni
 *
 */
public class Methods {

	public static void main() {

		System.out.println("_____Methods_____");
		System.out.println("Methods are an extremely powerful tool.");
		System.out.println("With a method, a programmer can create a small tool to be used throughout their program.");
		System.out.println("In this example, you will see a basic multiplication method in action.");
		System.out.println();
		Scanner mult = new Scanner(System.in);
		int product = getProduct(mult); // getProduct(mult) is the call, mult is the argument
		System.out.println("The product of these values is " + product);
		System.out.println();
	}

//public static int getProduct(Scanner mult) is the header, and Scanner mult is the parameter.
	public static int getProduct(Scanner mult) {
		System.out.print("Enter an int:");
		int num1 = mult.nextInt();
		System.out.println("Enter another int:");
		int num2 = mult.nextInt();
		return num1 * num2;

	}

}