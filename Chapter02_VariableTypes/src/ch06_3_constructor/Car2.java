package ch06_3_constructor;

	public class Car2 {
		// field
		String company2 = "BMW";
		String model2;
		String color2;
		int maxSpeed2;
		
		// Constructor
		Car2() {
		}
		
		Car2(String model2) {
			this(model2, "Silver", 250);
		}
		
		Car2(String model2, String color2) {
			this(model2, color2, 250);
		}
		
		Car2(String model2, String color2, int maxSpeed2) {
			this.model2 = model2;
			this.color2 = color2;
			this.maxSpeed2 = maxSpeed2;
			
		}
	}
