package ch09_1_nested_class_and_interface;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// create instance member class object
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// create static member class object.
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();

		// calling the method for local class object creation.
		a.method();
	}

}
