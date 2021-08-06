package ch07_3_polymorphism_ex;

	class MobilePhone {
		//field
		protected String number; // telephone number
		//public/ protected / default /private
		
		//constructor
		public MobilePhone(String num ) {
			number = num;
		}
		//method
		public void receive() {
			System.out.println("Hi~ from " + this.number);
		}
		
	}

	public class MobileSmartPhone extends MobilePhone{
		//field
		private String androidVer;
		
		//constructor
		public MobileSmartPhone(String num, String ver) {
			super(num);
			androidVer = ver;
		}
		// method
	}
	
	
	public class MobileSmartPhone2 {

		public static void main(String[] args) {
			// creating Smartphone object
			SmartPhone phone1 = new SmartPhone("010-0000-1111", "Android 7.0");
			
			// Reference type variable of parent class (phone2) could do refernece on instance of childclass (SmartPhone)
			// MobilePhone type reference variable can inherited the SmartPhone's instance.
			MobilePhone phone2 = new SmartPhone("010-0000-2222", "Android 7.0");
			
			phone2.number 

		}

	}