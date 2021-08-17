package sec01.exam01;

	public class CellPhone {
		//field
		String model;
		String color;
		
		//Constructor
		
		// method
		void powerOn() { // there is no inner method...
			System.out.println("Power on."); 
			}
		void powerOff() {
			System.out.println("Power off."); 
			}
		void bell() {
			System.out.println("Bell ranged.");
			}
		void sendVoice(String message) { // the parameter was given in this method...
			System.out.println("User: " + message);
			}
		void receiveVoice(String message) { // the parameter was given in this method...
			System.out.println("Receiver: " + message);
			}
		void hangUp() {
			System.out.println("Hanging up the phone.");
			}
	}
