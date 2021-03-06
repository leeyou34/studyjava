package ch07_2_type_change_and_various;

public class KumhoTire extends Tire{
	//field
	//constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire lifetime: " + (maxRotation - accumulatedRotation) + " cycle");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire got flatted.***");
			return false;
		}
	}
}
