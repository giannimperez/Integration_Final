
import java.util.Scanner;

/**
 * This class prompts the user for input of int x, then performs the sqrt math
 * function on x.
 * 
 * @author Gianni
 *
 */
public class MathClass {

	public static void main() {

		System.out.println("_____Math Class_____");
		System.out.println("The math class has many basic methods that do simple math");
		System.out.println("Enter an int and we will aquire its square root using Math.sqrt()");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(Math.sqrt(x));
		System.out.println();
	}

}