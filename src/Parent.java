/**
 * The parent class assignes int num = 1. The sub class overides the parents
 * class.
 * 
 * @author Gianni Perez
 **/
public class Parent {
	int num = 1;

}

class Sub extends Parent {
	int num = 5;

	void printNumber() {
		System.out.println(super.num);

	}

	public static void main() {
		System.out.println("_____Super_____");
		System.out.println("The super keyword refers to objects of a parent class.");
		System.out.println("Super will access a variable within the parent class, from the sub class.");
		System.out.println("");
		System.out.println("Example:");
		System.out.println("Our Parent Class contains int num = 1");
		System.out.println("Our Sub Class contains int num = 5");
		System.out.println("");
		System.out.println("If we print(super.num) within the sub class, it will pull");
		System.out.println("num from the parent class.");
		System.out.println("");

		Sub obj = new Sub();
		obj.printNumber();

		System.out.println("");

	}

}
