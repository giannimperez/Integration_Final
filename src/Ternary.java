
import java.util.Scanner;

/**
 * This class uses && and || in an if statement.
 * 
 * @author Gianni
 *
 */
public class Ternary {

	public static void main() {
		System.out.println("_____If/Else Statements_____");
		System.out.println("If/Else Statements are vital for programming.");
		System.out.println("They use basic logic to check if conditions are met, and act accordingly");
		System.out.println("_____Ternary Operators_____");
		System.out.println("== : checks if values are equal");
		System.out.println("!= : checks if values are not equal");
		System.out.println("> : checks if value is greater than");
		System.out.println(">= : checks if value is greater than or equal to");
		System.out.println("< : checks if value is less than");
		System.out.println("<= : checks if value is less than or equal to");
		System.out.println("&& : checks if values are both met");
		System.out.println("|| : checks if either value is met");
		System.out.println("");
		System.out.println("In this example, we will check if our values are met.");
		System.out.println("num1 = 5 and num2 = 1");
		System.out.println("Our code reads:");
		System.out.println("");
		System.out.println("if ((num1 == 5) && (num2 == 1))");
		System.out.println("	System.out.println(\"num1 is 5 AND num2 is 1\");");
		System.out.println("if ((num1 == 5) || (num2 == 5))");
		System.out.println("	System.out.println(\"num1 is 5 OR num2 is 5\");");
		System.out.println();
		System.out.println("Which output will print?");

		int num1 = 5;
		int num2 = 1;
		if ((num1 == 5) && (num2 == 1))
			System.out.println("num1 is 5 AND num2 is 1, meaning that both are equal to the numbers checked.");
		if ((num1 == 5) || (num2 == 5))
			System.out.println("num1 is 5 OR num2 is 5, meaning that either one is equal to 5.");
		System.out.println();

	}

}