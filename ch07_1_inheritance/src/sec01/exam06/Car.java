package sec01.exam06;

	public class Car {
		//field
		public int speed;
		
		//method
		public void speedUp() { speed += 1;}
		
		//final method
		
		public final void stop() {
			System.out.println("Stop the car");
			speed = 0;
		}
	}
