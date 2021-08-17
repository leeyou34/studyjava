package sec01.exam04;

	public class SupersonicAirplane extends Airplane{
		//field
		public static final int NORMAL = 1;
		public static final int SUPERSONIC = 2;
		
		public int flyMode = NORMAL;
		
		//method
		@Override
		public void fly() {
			if(flyMode == SUPERSONIC) {
				System.out.println("flying in supersonic mode");
			} else {
				super.fly(); // <--- this calls Airplane object's fly()method...
			}
		}
	}
