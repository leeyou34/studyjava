package ch06_4_method;

public class Car1 {
	//field
	int speed;
	
	//constructor
	
	//method
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Key is turned on.");
	}
	
	void run() {
		for(int i=10; i <=50; i +=10) {
			speed = i;
			System.out.println("Driving. (Current velocity: " + speed + "km/h");
		}
	}

}

