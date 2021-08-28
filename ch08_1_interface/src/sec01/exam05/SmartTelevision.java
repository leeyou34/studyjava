package sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable { // this class is (OBJECT) implements class of RemoteControl and Searchable class
	private int volume;
	
	public void turnOn() {
		System.out.println("Turn the TV on");
	}
	public void turnOff() {
		System.out.println("Turn the TV off");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}
	// searchable 's abstract method's real method...
	public void search(String url) {
		System.out.println(url + " searched...");
	}
}