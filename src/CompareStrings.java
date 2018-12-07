
import java.util.Scanner;

/**
 * == checks whether or not they are the same object, it does not check for
 * content or location in memory
 * 
 * @author Gianni Perez
 */
public class CompareStrings {

	public static void main() {
		System.out.println("_____Comparing Strings_____");
		System.out.println("Using the compareTo method, we can compare two String objects.");
		System.out.println("");
		System.out.println("Enter a String:");
		Scanner in = new Scanner(System.in);
		String num1 = in.nextLine();
		System.out.println("Enter another String:");
		Scanner in2 = new Scanner(System.in);
		String num2 = in2.nextLine();
		System.out.println("");

		System.out.println(".equals Check:");
		if (num1.equals(num2)) {
			System.out.println("The Strings are located in the same space in memory.");
		} else {
			System.out.println("The Strings are not located in the same space in memory.");
		}

		System.out.println("");
		System.out.println("CompareTo Check:");
		System.out.println(num1.compareTo(num2));
		System.out.println(" ^ If zero, the two texts have no difference.");
		System.out.println(" ^ If not zero, the two texts are not the same.");
		System.out.println("");
		System.out.println("== Check:");
		if (num1.equals(num2)) {
			System.out.println("The Strings are the same object");
		} else {
			System.out.println("The Strings are not the same object");
		}
		System.out.println();
	}

}