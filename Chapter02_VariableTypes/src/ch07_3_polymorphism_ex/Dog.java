package ch07_3_polymorphism_ex;

	public class Dog extends Animal {
		public Dog() {
			this.kind = "Mammals";
		}
		@Override
		public void sound() {
			System.out.println("Bow Wow");
		}
	}
