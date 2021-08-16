package ch06_5_instance_and_static_member;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car ("porsche"); // since we put "porsche" value as parameter...
		Car yourCar = new Car("Benz");
		
		myCar.run();
		yourCar.run();
	}
}
