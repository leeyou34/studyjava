package ch06_6_package;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// changing wrongly stated speed...
		myCar.setSpeed(-50);
		
		System.out.println("Current speed: " + myCar.getSpeed());
		
		// change to right speed.
		
		myCar.setSpeed(60);
		
		// Stop
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("Current speed: " + myCar.getSpeed());
	}

}
