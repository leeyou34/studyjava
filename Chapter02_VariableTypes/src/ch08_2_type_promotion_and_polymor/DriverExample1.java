package ch08_2_type_promotion_and_polymor;

public class DriverExample1 {

	public static void main(String[] args) {
		Driver driver = new Driver1();
		
		Bus1 bus = new Bus1();
		Taxi taxi = new Taxi();
		
		driver.drive1(bus);
		driver.drive(taxi);

	}

}
