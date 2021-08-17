package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("Thomas", "123456-1234567", 1);
		System.out.println("name : " + student.name); //print the inherited field from parent class.
		System.out.println("ssn : " + student.ssn);  //print the inherited field from parent class.
		System.out.println("studentNo : " + student.studentNo);  //print the field from child class.
		

	}

}
