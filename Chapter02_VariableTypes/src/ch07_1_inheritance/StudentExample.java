package ch07_1_inheritance;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("Thomas", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		

	}

}
