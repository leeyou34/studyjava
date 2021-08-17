package sec06.exam04.package1;

public class A {
	//field
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("string");
	
	//constructor
	public A(boolean b) {} //restrict the public access
	A(int b) {} // restrict the default access
	private A(String s) {} // restrict the private access
} // <--- this restricts the default access


/* explanation of restriction
 * 1. public access restriction: this allows any access from every package to call the constructor
 * 2. Default access restriction: the constructor can't be called from other package.
 * 3. Protect access restriction: the constructor can be called from other package if it is parents and child relationship.
 * 4. private access restriction: any package can't access. only class insdie can call the constructor and object.
 *
 *
 */