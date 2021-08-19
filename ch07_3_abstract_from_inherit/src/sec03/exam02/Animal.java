package sec03.exam02;

	public abstract class Animal { //abstract class
		//field
		public String kind;
		
		//method and there is no return value...
		public void breathe() {
			System.out.println("Breathing creature.");
		}
		
		// ideologically, sound method was declared as abstract with no return value.
		public abstract void sound(); //abstract method
}
