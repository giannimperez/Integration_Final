/**
 * This class sets the private int weight to 0, and leaves the getter and setter
 * public.
 * 
 * @author Gianni Perez
 **/
public class Private {

	private static int weight = 0;

	public static int getWeight() {
		return weight;
	}

	public void setWeight(int weight2) {
		if (weight < 0)
			weight = weight2;
	}

	public void raise(int raise) {
		setWeight(getWeight() + raise);
	}

	public void increment2(int raise) {
		weight = weight + raise;
	}

}
