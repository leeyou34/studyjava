package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// create the DmbCellPhone object.
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Phone Java", "Black", 10); // this creates the DmbCellPhone object with given parameter

		//inherited field from CellPhone class.
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("color: " + dmbCellPhone.color);
		
		//field of DmbCellPhone class
		System.out.println("Channel: " + dmbCellPhone.channel);
		
		//Call the method that was inherited from CellPhone class.
		dmbCellPhone.powerOn(); //dmbCellPhone is the variable declared with DmbCellPhone object type and it operates the powerOn() method.
		dmbCellPhone.bell(); // however, dmbCellPhone variable inherited the method information from Cellphone class(parent) 
		dmbCellPhone.sendVoice("Hello?"); // parameter "hello" is permited since parent class Cellphone stated String type on method's parameter.
		dmbCellPhone.receiveVoice("Hi! This is Thomas speaking."); // parameter "hello" is permited since parent class Cellphone stated String type on method's parameter.
		dmbCellPhone.sendVoice("It is my pleasure to be speaking with you");
		dmbCellPhone.hangUp();
		
		//Calling method of DmbCellPhone. 
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
