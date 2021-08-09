package ch08_1_interface;

	public class Audio implements RemoteControl {
		//field
		private int volume;
		
		//turnON() abstract method's real method
		public void turnOn() {
			System.out.println("Turn on the Audio");
		}
		//turnOff() abstract method's real method
		public void turnOff() {
			System.out.println("Turn off the Audio");
		}
		//SetVolume() abstract method's real method
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("Current Volume of Audio: " + this.volume);
		}
		
		
	}
