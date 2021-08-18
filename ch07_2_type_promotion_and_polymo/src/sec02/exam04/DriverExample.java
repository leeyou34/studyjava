package sec02.exam04;

	public class DriverExample { // this source file is the the operating purpose. 
		public static void main(String [] args) { // main method proves that it is about to operating
			Driver driver = new Driver(); // there are 3 varible declared. driver variable has Driver object and it constructs  Driver object
			Bus bus = new Bus(); //bus varaible is from Bus object and this constructs Bus object
			Taxi taxi = new Taxi();
					
			driver.drive(bus); // driver variable to operate drive method of what(parameter: bus)
			driver.drive(taxi); // driver variable to operate drive method of what(parameter: taxi)
		}
	}
