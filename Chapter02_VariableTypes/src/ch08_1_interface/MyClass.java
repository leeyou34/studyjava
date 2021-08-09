package ch08_1_interface;

	public class MyClass {
		// field
		RemoteControl rc = new Television();
		
		// Constructor
		MyClass() {
			
		}
		
		MyClass(RemoteControl RC) {
			this.rc = rc;
			rc.turnOn();
			rc.setVolume(5);
		}
		
		//Method
		void methodA() {
			RemoteControl rc = new Audio();
			rc.turnOn();
			rc.setVolume(5);
		}
		void methodB(RemoteControl rc) {
			rc.turnOn();
			rc.setVolume(5);
		}
	}
