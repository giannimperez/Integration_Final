/**
 * The Overload2 class creates two objects, one of which is overloaded.
 * 
 * @author Gianni Perez
 **/
public class Overload {

	public void main(String f) {
		System.out.println(f);
	}

	public void main(String f, int num) {
		System.out.println(f + " " + num);

	}
}

//Main calls to Overload2
class Overload2 {

	public static void main() {
		System.out.println("_____Overloading a Method_____");
		System.out.println("A method can be overloaded by having another method with");
		System.out.println("the same name, but different parameters.");
		System.out.println();
		System.out.println("Example in simple terms:");
		System.out.println("Method#1: Ten");
		System.out.println("Method#1: Ten,10");
		System.out.println();
		System.out.println("Method#1 is now overloaded and will return the following:");
		Overload obj = new Overload();
		obj.main("Ten");
		obj.main("Ten", 10);
		System.out.println();
	}
}