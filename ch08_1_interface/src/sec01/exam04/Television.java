package sec01.exam04;

public class Television implements RemoteControl{ // this is the implement class. and this implements the RemoteControl
	// field
	private int volume;
	
	//turnOn() // real method for abstracted method...
	public void turnOn() {
		System.out.println("Turn the TV on.");
	}
	//TurnOff() // real method for abstracted method...
	public void turnOff() {
		System.out.println("Turn the TV off.");
	}
	// setVolume() abstracted method's real method
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" Current TV Volume: " + this.volume);
	}
}
