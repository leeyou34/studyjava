package ch08_2_type_promotion_and_polymor;

	public class Car {
		//field
		Tire frontLeftTire = new HankookTire();
		Tire frontRightTire = new HankookTire();
		Tire backLeftTire = new HankookTire();
		Tire backRightTire = new HankookTire();
		
		//method
		void run() {
			frontLeftTire.roll();
			frontRightTire.roll();
			backLeftTire.roll();
			backRightTire.roll();
		}
		
	}
