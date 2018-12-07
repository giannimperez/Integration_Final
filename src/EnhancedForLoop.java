/**
 * This class includes an enhanced loop which prints the values of an array
 * "grades".
 * 
 * @author Gianni Perez
 **/
public class EnhancedForLoop {

	public static void main() {
		System.out.println("_____Enhanced For Loop_____");
		System.out.println("Enhanced for loops were designed as a simpler alternative for");
		System.out.println("traditional for loops, for use when working with arrays.");
		System.out.println("It accomplishes the same things, in an easier to write and more");
		System.out.println("readable format.");
		System.out.println();

		System.out.println("The following grades will be printed via an enhanced for loop.");
		System.out.println("Grades:");
		int grades[] = { 85, 92, 59, 81, 74 };
		for (int grade : grades) {
			System.out.println(grade);
			System.out.println();
		}

	}
}
