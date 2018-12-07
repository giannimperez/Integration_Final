
import java.util.Scanner;

/**
 * This class prompts the user to enter two strings, which are then compared
 * lexigraphically.
 * 
 * @author Gianni
 *
 */
public class StringMethods {

	public static void main() {
		System.out.println("_____String Methods_____");
		System.out.println("Strings have many methods that are designed to expand your");
		System.out.println("possibilities when using them.");
		System.out.println();

		System.out.println("The .compareTo method is used to compare two Strings lexicographically.");
		System.out.println();
		System.out.println("Enter a String:");
		Scanner in = new Scanner(System.in);
		String text1 = in.nextLine();
		System.out.println("Enter another String:");
		Scanner in2 = new Scanner(System.in);
		String text2 = in2.nextLine();
		int var1 = text1.compareTo(text2);
		System.out.println("The lexicographical difference in the Strings is " + var1 + ".");
		System.out.println();

		System.out.println("The concatenation method is used to add onto Strings at a certain point in the");
		System.out.println("code, without changing its value beforehand.");
		System.out.println();
		System.out.println("The following String originally contained the word \"Learning\", but");
		System.out.println("through concatenation, we made it print a full sentence:");
		String cnct = "Learning";
		cnct = cnct.concat(" is").concat(" fun!");
		System.out.println(cnct);
		System.out.println();

		System.out.println("The toUpperCase() method is used to change all characters in a String into");
		System.out.println("upper case characters.");
		System.out.println();
		System.out.println("Enter a String:");
		Scanner in3 = new Scanner(System.in);
		String text3 = in3.nextLine();
		System.out.println(text3.toUpperCase());
		System.out.println();

	}

}
