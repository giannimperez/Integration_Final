/**
 * The Car class constructs a car
*@author Gianni Perez
**/
public class Car {
	public static void demonstrate() {
		Car myCars[] = new Car[3];
		myCars[0] = new Ford();
		myCars[1] = new Chevy();
		myCars[2] = new Toyota();
		
		for (Car car: myCars) {
			System.out.println(car.showMake());
	}
}
	public String showMake() {
		return "unknown Make";
		
		
		}
	}
