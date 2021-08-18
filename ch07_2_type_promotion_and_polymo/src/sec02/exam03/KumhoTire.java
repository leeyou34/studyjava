package sec02.exam03;

public class KumhoTire extends Tire{
	//field
	//constructor
	public KumhoTire(String location, int maxRotation) { // constructor explains how field has to be formed.
		super(location, maxRotation); // super() calls the default constructor of parent's class 
									  // it hasn't appeared here but explained how child class would use the parent class's field.
	}
	//method
	@Override // replacing the method type on parent's class when child class has to be used by operating class.
	public boolean roll() { // following code shows how child class method has to be operated.
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
