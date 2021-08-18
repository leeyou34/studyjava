package sec02.exam04;

	public class Taxi extends Vehicle{ // Vehicle is the parent's class of Taxi.
		//method
		@Override
		public void run() {// run method has declared in void style. this doesnt' need to return the value.
			System.out.println("The taxi is on dirve mode");
		}
}

