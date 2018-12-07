
import java.util.Scanner;

/**
 * main describes the different data types and assigns a boolean, in, and double
 * value. String is also called from the Main Driver Class.
 * 
 * @author Gianni Perez
 *
 */
public class DataTypes {

	public static void main(String user) {
		System.out.println("_____Data Types_____");
		System.out.println("In the Java programming language, there are 4 main data types.");
		System.out.println("A data type is a classification that specifies the type of value a variable has.");
		System.out.println();
		System.out.println("These data types include:");
		boolean boolTest = true;
		System.out.println("boolean: true or false.              i.e. " + boolTest);
		int intTest = 5;
		System.out.println("int: any whole number.               i.e. " + intTest);
		double doubTest = 5.0;
		System.out.println("double: any decimal number.          i.e. " + doubTest);
		System.out.println("String: any alphanumeric characters. i.e. " + user);

		System.out.println();
		System.out.println(
				"The boolean data type is used for basic situations in which you only need a true or false value.");

		System.out.println(
				"The int data type is used to hold a number value for something that doesn't typically involve complex math.");

		System.out.println("The double data type is used for more complex math involving fractions.");

		System.out.println(
				"The String data type is used to display print, everything from single characters to full sentences of text. ");
		System.out.println("Your own name, " + user + " is an example of a String.");
		System.out.println();
		System.out.println("Variable refers to a location in memory.");
		System.out.println("Scope refers to the accessibility of variable within a");
		System.out.println("class or method. A variable not available will cause an error");

	}

}