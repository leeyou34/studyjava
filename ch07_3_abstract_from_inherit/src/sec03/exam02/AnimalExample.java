package sec03.exam02;
	/******
	 * inheritance is for forming the property of the object...
	 * 
	 *
	 */
	public class AnimalExample { // forming the property...
		public static void main(String[] args) {
			Dog dog = new Dog(); // dog variable declared as Dog class reference type and 'new'operator constructs and called Dog object.
			Cat cat = new Cat();  //cat variable declared as Cat class reference type and 'new'operator constructs and called cat object.
			dog.sound(); //the declared variable dog operates the sound from dog object
			cat.sound(); // the declared variable cat operates the sound from cat object.
			System.out.println("-----");
			
			//Converting in Promotion style in Variable
			
			Animal animal = null; // we declared animal variable as Animal class which is abstracted and give inital value null.
			animal = new Dog();// the animal variable 
			animal.sound();
			animal = new Cat();
			animal.sound();
			System.out.println("-----");
			
			// polymorphy the method

	}

}
