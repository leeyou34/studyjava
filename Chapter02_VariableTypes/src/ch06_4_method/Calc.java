package ch06_4_method;

public class Calc {

	//method
	void powerOn() {
		System.out.println("Power is on");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff() {
		System.out.println("Power is off.");
	}
}
