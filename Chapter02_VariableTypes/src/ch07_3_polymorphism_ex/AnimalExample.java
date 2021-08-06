package ch07_3_polymorphism_ex;

	public class AnimalExample {
		public static void main(String[] args) {
			Dog dog = new Dog();
			Cat cat = new Cat();
			dog.sound();
			cat.sound();
			System.out.println("-----");
			
			//Converting in Promotion style in Variable
			
			Animal animal = null;
			animal = new Dog();
			animal.sound();
			animal = new Cat();
			animal.sound();
			System.out.println("-----");
			
			// polymorphy the method

	}

}
