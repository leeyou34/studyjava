package sec02.exam04;

	public class Bus extends Vehicle{ // this line explains bus is child class of Vehicle.
		// method
		@Override// this would replace the parent's class method
		public void run() {
			System.out.println("The bus is on dirve mode");
		}
	}
