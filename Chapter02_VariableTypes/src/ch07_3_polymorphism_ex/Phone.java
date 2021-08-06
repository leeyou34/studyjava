package ch07_3_polymorphism_ex;

	public abstract class Phone {
		//field
		public String owner;
		
		//constructor
		public Phone(String owner) {
			this.owner = owner;
		}
		
		//method
		public void turnOn() {
			System.out.println("Turn on the phone power.");
		}
		public void turnOff() {
			System.out.println("Turn off the phone power.");
		}
	}
