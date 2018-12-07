
/**
 * Uses this to access objects and constructors.
 * 
 * @author Gianni
 *
 */
class This {
	int b;
	int c;

	This(int b, int c) {
		this.b = b;
		this.c = c;
	}

	void ThisTest() {
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	public static void main() {
		System.out.println("The keyword This is used to access a variable at a given point:");
		This object = new This(50, 100);
		object.ThisTest();
		System.out.println();
	}
}
