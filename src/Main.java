


import java.util.Scanner;
/**
 * This class is the driver class
 * @author Gianni
 */
public class Main {
/**
 *  This program is a basic example of object oriented programming in the Java language,
 * It will cover many of the basics within the language and provide examples and descriptive
 * explanations regarding their uses and capabilities. As well as interactive segments.
 * @author Gianni Perez
 * @param args
 */
  public static void main(String[] args) {
    
      System.out.println("Hello, welcome to my program! Enter your name.");
      Scanner in = new Scanner(System.in);
      String user = in.nextLine();
      System.out.println("Hello " + user + "!");
      System.out.println("This program will go over some of the basic Java concepts.");
      System.out.println();

    DataTypes.main(user);
    StringMethods.main();
    FormatStrings.main();
    Casting.main();
    Methods.main();
    Random.main();
    MathClass.main();
    Ternary.main();
    Switch.main();
    CompareStrings.main();
    MathOperators.main();
    PlusPlus.main();
    PlusEquals.main();
    WhileLoops.main();
    ForLoops.main();
    DoWhileLoops.main();
    BreakAndContinue.main();
    Overload2.main();
    Inheritance.main();
    Polymorphism.main();
    Car.demonstrate();
    Sub.main();
    Super.main();
    This.main();
    OneDimensionalArrays.main();
    EnhancedForLoop.main();
    MultiDimensionalArrays.main();
    ArrayLists.main();
    Private.getWeight();


  }
}