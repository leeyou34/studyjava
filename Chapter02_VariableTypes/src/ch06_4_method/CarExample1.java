package ch06_4_method;

public class CarExample1 {
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("Current velocity: " + speed + "km/h");
	}
}
