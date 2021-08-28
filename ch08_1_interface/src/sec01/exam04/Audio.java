package sec01.exam04;

public class Audio implements RemoteControl{ // this is the implement class. and this implements the RemoteControl
	// field
	private int volume;
	
	// turnOn abstract method's real method...
	public void turnOn() {
		System.out.println("Turn the Audio on.");
	}
	// turnOff abstract method's real method...
	public void turnOff() {
		System.out.println("Turn the Audio off.");
	}
	// setVolume() abstract method's real method...
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" Current Audio volume : " + this.volume);
	}
}