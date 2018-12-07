/**
 * Parent class.
 * 
 * @author Gianni Perez
 **/
class Human {
	Human() {
		System.out.println("Human class Constructor.");

	}
}

/**
 * Child class, uses super to println.
 * 
 * @author Gianni
 *
 */
class Policeman extends Human {
	Policeman() {
		super();
		System.out.println("Policeman class Constructor.");
	}
}

/**
 * Uses super to access objects and constructors between the parent and child
 * classes.
 * 
 * @author Gianni
 *
 */
class Super {
	public static void main() {
		System.out.println("The keyword Super is used to access a variable from the parent class:");
		Policeman y = new Policeman();
		System.out.println(y);

	}

}
