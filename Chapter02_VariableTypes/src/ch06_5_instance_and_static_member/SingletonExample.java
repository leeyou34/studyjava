package ch06_5_instance_and_static_member;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 */
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("It is same singleton object.");
		} else {
			System.out.println("It is different singleton object.");
		}
	}
}
