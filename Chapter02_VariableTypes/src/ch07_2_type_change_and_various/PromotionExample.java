package ch07_2_type_change_and_various;
	
	class A {} // let's say class A is Animal
	
	class B extends A {} // let's say C is Cat. Cat is under Animal category...
	class C extends A {} 
	
	class D extends B {}
	class E extends C {}
	
	class Myclass {}
	
	public class PromotionExample {
		public static void main(String [] args ) {
			B b = new B(); //
			C c = new C();
			D d = new D();
			E e = new E();
		
			Myclass my = new Myclass();
	
			
			
			A a1 = b;
			A a2 = c;
			A a3 = d;
			A a4 = e;

			B b1 = d;
			C c1 = e;
			
			//B b3 = e;
			//C c2 = d;
	}
}
