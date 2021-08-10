package ch09_2_anonymous_2;

public class Anonymous {
	// substitute the field initial value.
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV will be turned on.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV will be turned off.");
		}
	};
	
	void method2(ch08_1_interface.RemoteControl rc) {
		rc.turnOn();
	}
}
