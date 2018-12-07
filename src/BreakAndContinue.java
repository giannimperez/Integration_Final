/**
*
*@author Gianni Perez
*/
public class BreakAndContinue {

	public static void main() {
		System.out.println("_____Break and Continue_____");
		System.out.println("Break allows the program to exit the loop.");
		System.out.println("Continue allows the loop to jump to its next iteration.");
		System.out.println();
		System.out.println("Example:");
		System.out.println();
		System.out.println();

		System.out.println("Beginning Loop Now");
		for (int x = 0; x < 7; ++x) {
			System.out.println("Loop# : " + x);
			if (x == 2) {
				continue;
			}
			System.out.println("Loop Running");
			if (x == 4) {
				break;
			}
			System.out.println("Loop Complete");
		}

		System.out.println("<break has caused the loop to end>");
		System.out.println();
	}

}