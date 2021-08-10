package ch09_1_nested_class_and_interface;

//***outter class***
	class A {
		A() { System.out.println("A object was created.");}
	
	//**instance member class**	
	class B {
		B() { System.out.println("B object was created.");}
		int field1;
		//static int field2;
		void method1() {}
		//static void method2() {}
	}
	
	//**static member class**
	static class C {
		C() { System.out.println("C object was created.");}
		int field1;
		static int field2;
		void method1() { }
		static void method2 () { }
	}
	
	void method () {
		/*** local class ***/
		class D {
			D() { System.out.println("D object was created.");}
			int field1;
			//static int field2;
			void method1() { }
			//static void method 2() { }
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
