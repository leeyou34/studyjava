package sec01.exam01;

	public class DmbCellPhone extends CellPhone{
		//field
		int channel;
		
		//Constructor
		DmbCellPhone(String model, String color, int channel) {
			this.model = model; // this field was inherited from CellPhone class
			this.color = color; // this field was inherited from CellPhone class
			this.channel = channel; // this talks about the DmbCellPhone constructor's parameter int channel.
		}
		
		//method
		void turnOnDmb() { //there is no inner method...
			System.out.println("Channel " + channel + " DMB broadcasting will be started.");
		}
		void changeChannelDmb(int channel) { // the parameter was given in this method...
			this.channel = channel;
			System.out.println("Channel " + channel + "will be shown.");
		}
		void turnOffDmb() {
			System.out.println("DMB broadcasting will be stopped");
		}
	}
