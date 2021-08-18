package sec02.exam03;

public class CarExample { // this is operating class it would use API library which is composed of parent and child (inherited) classes

	public static void main(String[] args) { // this is how we find out operates 
		Car car = new Car(); // car is the variable and called Car object. this is constructor with empty parameter.
		
		for (int i = 1; i <=5; i++) { // we do know the car object's condition it runs and stops. since a car has 4 wheels there are 5 condition to be appear on the tire.
			int problemLocation = car.run(); // let's declare varible called problemlocation(defects) in integer type. this variable has given function that operates the method called run with empty parameter.
			
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
