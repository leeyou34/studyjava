package ch07_3_polymorphism_ex;

	public class Cat extends Animal{
		public Cat() {
			this.kind = "Mammals";
		}
		@Override
		public void sound() {
			System.out.println("Meow");
		}
	}
