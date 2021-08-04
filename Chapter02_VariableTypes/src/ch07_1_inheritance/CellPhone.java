package ch07_1_inheritance;

	public class CellPhone {
		//field
		String model;
		String color;
		
		//Constructor
		
		// method
		void powerOn() {System.out.println("Power on."); }
		void powerOff() {System.out.println("Power off."); }
		void bell() {System.out.println("Bell ranged.");}
		void sendVoice(String message) {System.out.println("User: " + message);}
		void receiveVoice(String message) {System.out.println("Receiver: " + message);}
		void hangUp() {System.out.println("Hanging up the phone.");}
		
	}
