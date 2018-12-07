
import java.util.Arrays;
import java.util.stream.*;

/**
 * Final is used in these arrays, which allows their values to remain the same,
 * and keeps any other code from changing their values. I had some trouble with
 * them, and after trying final, it seemed to have fixed the issue, so I applied
 * it to both and it worked well.
 * 
 * @author Gianni Perez
 * 
 */
public class OneDimensionalArrays {

	public static void main() {
		System.out.println("_____One Dimensional Arrays_____");
		System.out.println("An array is a container object that holds values of a");
		System.out.println("specified data type.");
		System.out.println("");

		System.out.println("Example:");
		System.out.println("Our array holds the values 5, 10, 15, 20, 25.");
		System.out.println();

		System.out.println("What is the smallest value in our array?");
		final int[] ARRAY_1 = { 5, 10, 15, 20, 25 };
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < ARRAY_1.length; i++) {
			if (smallest > ARRAY_1[i]) {
				smallest = ARRAY_1[i];
			}
		}
		System.out.println("Smallest value = " + smallest);

		System.out.println();
		System.out.println("What is the sum of the values?");
		int[] ARRAY_2 = { 5, 10, 15, 20, 25 };
		int sum = 0;
		for (int x : ARRAY_2)
			sum += x;
		System.out.println("Sum = " + sum);

		System.out.println();
		System.out.println("What is the index of 15 in our array?");
		for (int y = 0; y < ARRAY_2.length; y++)
			if (ARRAY_2[y] == 15)
				System.out.println(y);
		System.out.println();

	}
}
