package ch07_2_type_change_and_various;

	public class DriverExample {
		public static void main(String [] args) {
			Driver driver = new Driver();
			Bus bus = new Bus();
			Taxi taxi = new Taxi();
					
			driver.drive(bus);
			driver.drive(taxi);
		}
	}
