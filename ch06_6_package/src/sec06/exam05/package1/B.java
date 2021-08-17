package sec06.exam05.package1;

public class B { //in B class which known as API library or B object. this is known as field.
	public B() { // constructor of B and it is public
	A a = new A();
	a.field1 = 1;
	a.field2 = 1;
	// a.field3 = 1; //can't be accessed into private field .
	
	a.method1();
	a.method2();
	//a.method3();  // can't be accessed into private method .
	//A a3 = new A("string"); // private constructor access has denied
	}
}
