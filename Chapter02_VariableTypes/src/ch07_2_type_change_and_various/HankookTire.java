package ch07_2_type_change_and_various;

public class HankookTire extends Tire{
	//field
	//constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
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
