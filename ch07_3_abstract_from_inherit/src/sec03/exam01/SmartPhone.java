package sec03.exam01;

	public class SmartPhone extends Phone { // this is the child class of Phone but phone is abstract class.
		// Constructor
		public SmartPhone(String owner) {
			super(owner); // this super operator calls the parent class field which was declared as abstract class.
		}
		
		// Method
		public void internetSearch() {
			System.out.println("Searching Internet.");
		}
}
