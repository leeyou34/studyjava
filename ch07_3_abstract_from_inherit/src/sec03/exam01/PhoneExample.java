package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("Thomas Lee"); // this smartPhone variable uses SmartPhone object type. and it constructs the SmartPhone by using new operator.
		// since constructor gave the guide of composition of constructor, we can put String type on parameter.
		smartPhone.turnOn(); // this variable operates abstracted parent class's method 'turnOn'
		smartPhone.internetSearch(); // this variable operates the child class's method
		smartPhone.turnOff(); // this variable operates the parent's class.

	}

}
