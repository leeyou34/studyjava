package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation ) {
			case 1:
				System.out.println("front left wheel change to HankookTire.");
				car.frontLeftTire = new HankookTire("front left", 15);
				break;
			case 2:
				System.out.println("front right wheel change to KumhoTire.");
				car.frontLeftTire = new KumhoTire("front right", 13);
				break;
			case 3:
				System.out.println("front left wheel change to HankookTire.");
				car.frontLeftTire = new HankookTire("back left", 14);
				break;
			case 4:
				System.out.println("front left wheel change to KumhoTire.");
				car.frontLeftTire = new KumhoTire("back right", 17);
				break;
			}
			System.out.println("----------------------------");
		}

	}

}
