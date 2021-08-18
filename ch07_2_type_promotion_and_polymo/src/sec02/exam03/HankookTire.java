package sec02.exam03;

public class HankookTire extends Tire{
	//field
	//constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // super() calls parent's class constructor and it follows parent' constructor style even using fields.
	}
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire lifetime: " + (maxRotation - accumulatedRotation) + " cycle");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire got flatted.***");
			return false;
		}
	}
}
