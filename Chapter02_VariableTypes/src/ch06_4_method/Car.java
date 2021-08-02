package ch06_4_method;

public class Car {
	// field
	int gas;
	
	// constructor
	
	// method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("there is no gas.");
			return false; // return the false...
		}
		System.out.println("there is gas");
		return true; // return the true
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("Driving. (Gas leftover: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("Stop driving. (Gas leftover: " + gas +")");
				return; // method running is finished.
			}
		}
	}

}
