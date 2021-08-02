package ch06_3_constructor;

public class CarExample2 {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("car1.company: " + car1.company2);
		System.out.println();

		Car2 car2 = new Car2("Owned");
		System.out.println("car2.company: " + car2.company2);
		System.out.println("car2.company: " + car2.model2);
		System.out.println();
		
		Car2 car3 = new Car2("Ownded", "Red");
		System.out.println("car3.company: " + car3.company2);
		System.out.println("car3.company: " + car3.model2);
		System.out.println("car3.company: " + car3.color2);
		System.out.println();

		Car2 car4 = new Car2("Taxi", "Black", 200);
		System.out.println("car4.company: " + car4.company2);
		System.out.println("car4.company: " + car4.model2);
		System.out.println("car4.company: " + car4.color2);
		System.out.println("car4.company: " + car4.maxSpeed2);
		System.out.println();

	}

}
