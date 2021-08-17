package sec01.exam02;

	public class People { //this is People object it is public. there is no restriction of modifying and access from other class.
		// field
		public String name;
		public String ssn;
		//constructor
		public People(String name, String ssn) { // this shows how this class must be constructed.. with same class name. inside of constructor is parameter which was declared from field.
			this.name = name;
			this.ssn = ssn;
		}
	}
