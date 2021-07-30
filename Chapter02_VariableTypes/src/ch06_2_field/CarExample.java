package ch06_2_field;

public class CarExample {

	public static void main(String[] args) {
		// create the object
		Car myCar = new Car();
		
		// read the field value
		System.out.println("Manufactural : " + myCar.company);
		System.out.println("Model : " + myCar.model);
		System.out.println("Color : " + myCar.color);
		System.out.println("Max speed : " + myCar.maxSpeed);
		System.out.println("Current speed : " + myCar.speed);
		
		// changing field value
		myCar.speed= 60;
		System.out.println("Adjusted Speed: " + myCar.speed);

	}

}
