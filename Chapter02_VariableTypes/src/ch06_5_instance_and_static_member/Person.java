package ch06_5_instance_and_static_member;

public class Person {
	// here is the field area and it is declared as final... it's constant and never fix
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) { // this is the constructor and it shows parameter that needs to be place
		this.ssn = ssn; // here is the field that would be used on parameter
		this.name = name; // here is the field that would be used on parameter
	}
}
