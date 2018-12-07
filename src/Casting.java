
import java.util.Scanner;

/**
 * Casting is used to convert one data type into another.
 * 
 * @author Gianni Perez
 */
public class Casting {

	public static void main() {

		System.out.println("_____Casting_____");
		System.out.println("Casting is used to convert one data type into another.");
		System.out.println("Enter a double and we will convert it into an int:");
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();

		int num2 = (int) num;
		System.out.println(num2);
		System.out.println();

	}

}