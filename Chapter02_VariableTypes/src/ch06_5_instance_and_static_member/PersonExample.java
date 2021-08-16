package ch06_5_instance_and_static_member;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "Thomas");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);

	}

}
