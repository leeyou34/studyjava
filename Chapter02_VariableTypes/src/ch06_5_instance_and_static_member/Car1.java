package ch06_5_instance_and_static_member;

public class Car1 {
	// for Car1 class. this is api library type and it is Car1 object.
	// below is the field. the variable is speed and it's integer type.
	int speed; // speed was declared with integer type
	
	void run() { // this method has no return. it eventually print the following code.
		System.out.println(speed + " on this speed."); // inside of println paramter there is field with string code.
	}
	
	public static void main(String[] args) {
		Car1 myCar = new Car1(); // myCar variable uses Car1 object and it constructs the Car1 class.
		myCar.speed = 60; // variable myCar operates speed but it's field so we give integer value 60.
		myCar.run(); // myCar variable operates the method and method would operate the code.
	}
}
