
import java.util.Scanner;

/**
 * This class prompts the user to enter an int for num, which uses a switch
 * statement to print the day of the week that it falls on.
 * 
 * @author Gianni
 *
 */
public class Switch {

	public static void main() {
		System.out.println("_____Switch Statements_____");
		System.out.println("Switch statements are used as a branch statement, allowing any number of executions");
		System.out.println("to occur, based on a defined value.");
		System.out.println();

		System.out.println("Enter a number, between 1 and 7 and this switch statement will print which day of");
		System.out.println("the week it falls on:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String day;
		switch (num) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid selection";
			break;
		}

		System.out.println(day);
		System.out.println();

	}

}
