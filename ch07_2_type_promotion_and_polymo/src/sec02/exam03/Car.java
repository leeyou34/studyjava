package sec02.exam03;

	public class Car {
		//field
		Tire frontLeftTire = new Tire ("Left front", 6);
		Tire frontRightTire = new Tire ("Right front", 2);
		Tire backLeftTire = new Tire ("Left back", 3);
		Tire backRightTire = new Tire ("Right back", 4);
		
		//constructor
		
		//method
		int run() {
			System.out.println("[The car is on drive mode]");
			if(frontLeftTire.roll()==false) { stop(); return 1;}
			if(frontRightTire.roll()==false) { stop(); return 2;}
			if(backLeftTire.roll()==false) { stop(); return 3;}
			if(backRightTire.roll()==false) { stop(); return 4;}
			return 0;
		}
		
		void stop() {
			System.out.println("[The car would be stopped");
		}
	}
