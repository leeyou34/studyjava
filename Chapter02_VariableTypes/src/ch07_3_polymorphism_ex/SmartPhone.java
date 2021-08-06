package ch07_3_polymorphism_ex;

	public class SmartPhone extends Phone {
		// Constructor
		public SmartPhone(String owner) {
			super(owner);
		}
		
		// Method
		public void internetSearch() {
			System.out.println("Searching Internet.");
		}
}
