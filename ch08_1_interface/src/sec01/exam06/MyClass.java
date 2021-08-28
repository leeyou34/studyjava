package sec01.exam06;

public class MyClass {
	//field
	RemoteControl rc = new Television();
	
	// Constructor
	MyClass() {
		
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//method
	void methodA() {
		RemoteControl rc =  new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
