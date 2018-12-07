/**
 * The plusplus and minusminus tools are explained via println.
 * 
 * @author Gianni Perez
 **/
public class PlusPlus {

	public static void main() {
		System.out.println("_____++ and --_____");
		System.out.println("++ will increment a value by 1");
		System.out.println("-- will decrement a value by 1");
		System.out.println();
		System.out.println("Pre/Post:");
		System.out.println("When incrementing or decrementing, the location of your operator matters.");
		System.out.println();
		System.out.println("For example:");
		System.out.println();
		System.out.println("int a = 5;");
		System.out.println("int b = 3;");
		System.out.println("int c = a * b++;");
		System.out.println("Result: c would equal 15.");
		System.out.println();
		System.out.println("int a = 5;");
		System.out.println("int b = 3;");
		System.out.println("int c = a * ++b;");
		System.out.println("Result: c would equal 20");
		System.out.println();
		System.out.println("The reason these yield different results is because of the incrementor's location.");
		System.out.println("b++ adds 1 to b, after the equation is performed.");
		System.out.println("++b adds 1 to b, before the equation is performed.");
		System.out.println();
		System.out.println("Let's try another:");
		System.out.println();
		System.out.println("int a = 5;");
		System.out.println("int b = 3;");
		System.out.println("int c = a * b--;");
		System.out.println("Result: c would equal 15.");
		System.out.println();
		System.out.println("int a = 5;");
		System.out.println("int b = 3;");
		System.out.println("int c = a * --b;");
		System.out.println("Result: c would equal 10");
		System.out.println();
	}

}