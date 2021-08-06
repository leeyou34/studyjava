package ch07_3_polymorphism_ex;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("Thomas Lee");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
