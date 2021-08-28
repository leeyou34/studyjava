package sec01.exam04;

public class RemoteControlExample { // this is the operating class.
	public static void main(String[] args) { // when main method activate the parameter String[] args, the program runs...
		RemoteControl rc; //  this RemoteControl type is the interface and we declared the rc variable...
		rc = new Television(); // rc variable operated the constructing the Televsion object... (television is the class that implements the RemoteControl) 
		rc = new Audio(); // rc variable operated the contstructing the Audio object... (Audio is the class that implements the RemoteControl)
		
	}

}
