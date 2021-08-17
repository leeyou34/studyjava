package sec01.exam06;

	public class SportsCar extends Car {
		@Override
		public void speedUp() { speed += 10;}
		
//		@Override
//		public void stop() { // since stop method were declared final on parent's section... this method code can't be inherited...
//			System.out.println("Stop the sportscar");
//			speed = 0;
//		}
	}
