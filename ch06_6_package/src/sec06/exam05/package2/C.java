package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	//constrcutor
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1; // can't access into default field 
		//a.field3 = 1; // can't access into private field
		
		a.method1();
		//a.method2(); // can't access into default method
		//a.method3(); // can't access into private method
	}
}
