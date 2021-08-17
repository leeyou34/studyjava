package sec06.exam05.package1;

	public class A {
		//field
		public int field1; // public restrict
		int field2; // default restrict
		private int field3; // private access is restricted
		
		//constructor
		public A() { // below information won't be affected by restriction.
			field1 = 1;
			field2 = 1;
			field3 = 1;
			
			method1();
			method2();
			method3();
		}// above information won't be affected by restriction.
		
		//method
		public void method1() {} // public access restriction
		void method2() {} // default access restriction
		private void method3() {} // private access restriction
	}
	