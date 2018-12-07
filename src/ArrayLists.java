
import java.util.*;
/**
 * @param ArrayList generates an array of grocery items.
 * @author Gianni Perez
 */
public class ArrayLists {

	public static void main() {
		System.out.println("_____Array Lists_____");
		System.out.println("Array lists are one of the simplest ways to hold a list of values.");
		System.out.println("They can hold a specified data type in a given order.");
		System.out.println("You can then do things like: find position of items in the list, find size of");
		System.out.println("the list, add and remove from the list, etc.");
		System.out.println();
		System.out.println("This is an example of a grocery array list:");
		System.out.println();

		ArrayList<String> grocery = new ArrayList<String>();
		grocery.add("Apples");
		grocery.add("Eggs");
		grocery.add("Milk");
		grocery.add("Butter");
		grocery.add("Chicken");
		grocery.add("Lettuce");

		System.out.println(grocery);
		System.out.println();
	}

}
