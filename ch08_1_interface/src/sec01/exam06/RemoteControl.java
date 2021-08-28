package sec01.exam06;

	public interface RemoteControl {
		//constant variable
		public int MAX_VOLUME = 10;
		public int MIN_VOLUME = 0;
		
		// abstract method //<---- there is no abstracted method was clearfied but... when method is declared in the interface, it's abstract interface...
		public void turnOn(); // <---- write down only method declareation... not the value in the blocks...
		public void turnOff();
		public void setVolume(int volume); //<-- this method has parameter and it has declared...
		
	}
