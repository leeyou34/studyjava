package sec02.exam03;

	public class Car { // this class designed the car object.
		//field // this field talks about tire objects in this class. there are 4 tires. //
		Tire frontLeftTire = new Tire ("Left front", 6); // frontlefttire is variable and it's field
		Tire frontRightTire = new Tire ("Right front", 2); // these constructs the tire and appears tire object in this Car class.
		Tire backLeftTire = new Tire ("Left back", 3); // following Tire's parameter has to be written in format because constructor set it from tire class.
		Tire backRightTire = new Tire ("Right back", 4); // parameter follows string and integer type.
		
		//constructor
		
		//method // explains how this car function.
		int run() { // when operating class operates this method, 
			System.out.println("[The car is on drive mode]"); // following string will be printed
			if(frontLeftTire.roll()==false) { // if field operates the roll method to meet false condition,
				stop(); // stop the function
				return 1; // then return 1;
				}
			if(frontRightTire.roll()==false) {
				stop(); // stop method is stated below. and the method would operate the function print.
				return 2;
				}
			if(backLeftTire.roll()==false) { 
				stop(); 
				return 3;
				}
			if(backRightTire.roll()==false) { 
				stop(); 
				return 4;
				}
			return 0; // if nothing happens returns 0.
		}
		
		void stop() {
			System.out.println("[The car would be stopped");
		}
	}
