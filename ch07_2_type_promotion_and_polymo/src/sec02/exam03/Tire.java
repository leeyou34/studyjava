package sec02.exam03;

	public class Tire {
		//field (there are 3 fields and 
		public int maxRotation; // this field is declared as integer type. numerical value must be initalized
		public int accumulatedRotation; // this field is declared s integer type. numerical value must be input
		public String location; // this location field needs to be stated as String type.
		
		//constructor (생성자)
		public Tire(String location, int maxRotation) { // guide that operating class could use in certain format.
			this.location = location; // constructor's parameter needs to be declared.
			this.maxRotation = maxRotation; // parameter must be used from field.
		}
		
		//method
		public boolean roll() { // roll method has declared and it's boolean type. it's either yes or no.
			++accumulatedRotation; // variable accblahblah is increase by 1
			if(accumulatedRotation<maxRotation) { // yes or no.
				System.out.println(location + "Tire lifetime: " + (maxRotation - accumulatedRotation) + " cycle");
				return true; // return value has to annnounced above boolean type method didn't declare as void.
			} else {
				System.out.println("*** " + location + " Tire got flatted.***");
				return false;
			}
		}
	}
