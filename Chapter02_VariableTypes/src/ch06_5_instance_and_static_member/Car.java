package ch06_5_instance_and_static_member;

public class Car {
	//field
	String model; // field "model" aka reference 'string' type was declared with no value. 
	int speed; //field speed was declared.
	
	//constructor
	Car(String model) { // when the other class call constructor following code would be execute.
		this.model = model;
	}
	
	//method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() { 
		for(int i = 10; i <=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "is running. (speed: " + this.speed + "km/h");
		}
	}
}
