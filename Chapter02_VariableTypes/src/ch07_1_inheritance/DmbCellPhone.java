package ch07_1_inheritance;

	public class DmbCellPhone extends CellPhone{
		//field
		int channel;
		
		//Constructor
		DmbCellPhone(String model, String color, int channel) {
			this.model = model;
			this.color = color;
			this.channel = channel;
		}
		
		//method
		void turnOnDmb() {
			System.out.println("Channel " + channel + " DMB broadcasting will be started.");
		}
		void changeChannelDmb(int channel) {
			this.channel = channel;
			System.out.println("Channel " + channel + "will be shown.");
		}
		void turnOffDmb() {
			System.out.println("DMB broadcasting will be stopped");
		}
	}
