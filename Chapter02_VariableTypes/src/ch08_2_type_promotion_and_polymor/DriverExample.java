package ch08_2_type_promotion_and_polymor;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //<------ promotion Vehicle vehicle = bus;
		driver.drive(taxi);//<------ promotion Vehicle vehicle = taxi;

	}

}
