package ch08_1_interface;

	public class Television implements RemoteControl{
		//field
		private int volume;
		
		//turnOn() abstract method's real method
		public void turnOn() {
			System.out.println("Turn on the TV");
		}
		//turnOff() abstract method's real method
		public void turnOff() {
			System.out.println("Turn off the TV");
		}
		//setVolume() abstract method's real method
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("Current Volume of TV: " + this.volume);
		}
	}
