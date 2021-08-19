package sec03.exam02;

	public class Dog extends Animal {
		//constructor
		public Dog() {
			this.kind = "Mammals"; // 'this' operator used 'kind' from abstracted parent' field. 
		}
		@Override
		public void sound() { // this method would replace the sound method with no return value.
			System.out.println("Bow Wow");
		}
	}
