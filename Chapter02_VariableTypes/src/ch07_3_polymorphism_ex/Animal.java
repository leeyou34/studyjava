package ch07_3_polymorphism_ex;

	public abstract class Animal { //abstract class
		public String kind;
		
		public void breathe() {
			System.out.println("Breathing creature.");
		}
		
		public abstract void sound(); //abstract method
}
