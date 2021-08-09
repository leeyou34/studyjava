package ch08_2_type_promotion_and_polymor;

public class Driver1 {

	public static void drive(Vehicle1 vehicle) {
		if(vehicle instanceof Bus1) {
			Bus1 bus = (Bus1) vehicle;
			bus.checkFare();
		}
		vehicle.run();

	}

}
