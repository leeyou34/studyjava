package ch08_2_type_promotion_and_polymor;

	public class Bus1 implements Vehicle1{
		@Override
		public void run() {
			System.out.println("Bus is on move.");
		}
		
		public void checkFare() {
			System.out.println("Checking the fare.");
		}
	}
