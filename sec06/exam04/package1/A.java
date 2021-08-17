package sec06.exam04.package1;

public class A {
	//field
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("string");
	
	//constructor
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
} // <--- this restricts the default access
