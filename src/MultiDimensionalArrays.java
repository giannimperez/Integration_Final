
import java.util.Scanner;

/**
 * This class constructs a simple multi-dimensional array.
 * 
 * @author Gianni Perez
 *
 */
public class MultiDimensionalArrays {

	public static void printArray(int[] row) {
		for (int i : row) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
	}

	public static void main() {
		System.out.println("_____Multi-Dimensional Arrays_____");
		System.out.println("A multi-dimensional array is almost the same as a one dimensional array in that");
		System.out.println("it functions as a container for data values, but it can hold and display those");
		System.out.println("values in a 2D format.");
		System.out.println("They can be used to hold data in a table format and even make simple games.");
		System.out.println("");
		System.out.println("Multi-dimensional array:");

		int array[][] = new int[7][5];
		int i, j, k = 1;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				array[i][j] = k;
				k++;
			}
		}

		for (int[] row : array) {
			printArray(row);
		}

		System.out.println("");
		System.out.println("We can even search for the coordinates of a value in our 2D array.");
		System.out.println();

		System.out.println("Please enter a value from our array that you'd like to ");
		System.out.println("know the coordinates of:");
		Scanner in = new Scanner(System.in);
		int selec = in.nextInt();
		int x, y;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[0].length; j++) {
				if (array[i][j] == selec) {
					x = i;
					y = j;
					System.out.println("The coordinates of " + selec + " are " + x + "," + y);
				}
			}
		}
	}

}
