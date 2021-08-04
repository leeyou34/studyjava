package ch07_1_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// create the DmbCellPhone object.
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Phone Java", "Black", 10);

		//inherited field from CellPhone class.
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("color: " + dmbCellPhone.color);
		
		//field of DmbCellPhone class
		System.out.println("Channel: " + dmbCellPhone.channel);
		
		//Call the method that was inherited from CellPhone class.
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello?");
		dmbCellPhone.receiveVoice("Hi! This is Thomas speaking.");
		dmbCellPhone.sendVoice("It is my pleasure to be speaking with you");
		dmbCellPhone.hangUp();
		
		//Calling method of DmbCellPhone. 
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
