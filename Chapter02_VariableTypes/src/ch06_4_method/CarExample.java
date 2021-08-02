package ch06_4_method;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); // Calling Car's setGas() method
		
		boolean gasState = myCar.isLeftGas(); //Calling Car's isLeftGas() method...
		if(gasState) {
			System.out.println("Driving");
			myCar.run(); // Calling Car's run() method...
		}
		
		if(myCar.isLeftGas()) { // Calling Car's isLeftGas() method...
			System.out.println("It is not neccessary to refill the gas.");
		} else {
			System.out.println("It is not neccessary to refill the gas.");
		}
	}

}
