package sec03.exam02;

	public class Cat extends Animal{
		// constructor
		public Cat() {
			this.kind = "Mammals"; // this operator used the 'kind' from Cat's parent abstracted class and it has String type value.
		}
		@Override
		public void sound() { // this would replace the abstracted parent class's sound
			System.out.println("Meow");
		}
	}
