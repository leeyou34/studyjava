package ch08_2_type_promotion_and_polymor;

public class VehicleExample1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		
		Bus1 bus = (Bus1) vehicle; // <--- casting the vehicle to Bus...
		
		bus.run();
		bus.checkFare();

	}

}
