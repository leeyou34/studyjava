package ch06_3_constructor;

	public class Car1 {
		// field
		String company = "BMW";
		String model;
		String color;
		int maxSpeed;
		
		// Constructor
		Car1() {
		}
		Car1(String model) {
			this.model = model;
		}
		Car1(String model, String color) {
			this.model = model;
			this.color = color;
		}
		Car1(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}
