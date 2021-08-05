package ch07_2_type_change_and_various;

	public class Tire {
		//field
		public int maxRotation;
		public int accumulatedRotation;
		public String location;
		
		//constructor
		public Tire(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
		}
		
		//method
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				System.out.println(location + "Tire lifetime: " + (maxRotation - accumulatedRotation) + " cycle");
				return true;
			} else {
				System.out.println("*** " + location + " Tire got flatted.***");
				return false;
			}
		}
	}
