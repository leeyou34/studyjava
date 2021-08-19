package sec03.exam01;
	/******* 
	 * @author thomas
	 * for abstrct (추상 클래스), 
	 * 1. this class uses to unify the common fields and methods
	 * 2. for writing the real class, abstract class saves the time.
	 *
	 */
	public abstract class Phone {
		// when there is abstract class, new operator can't create the object. only it creates the child class by using inheritance.
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
