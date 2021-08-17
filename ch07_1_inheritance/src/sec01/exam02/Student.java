package sec01.exam02;

public class Student extends People{
		//field
		public int studentNo;
		//constructor
		public Student(String name, String ssn, int studentNo) {
			super(name, ssn); // <------ calling parents constructor "  public People(String name, String ssn)   "
			this.studentNo = studentNo;
		}
	}

