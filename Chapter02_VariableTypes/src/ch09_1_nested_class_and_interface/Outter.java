package ch09_1_nested_class_and_interface;

public class Outter {
//	//Java 7 previous version
//	public void method1(final int arg ) {
//		final int localVariable = 1;
//		//arg =100;
//		//localVariable = 100;
//		class Inner {
//			public void method() {
//				int result = arg + localVariable;
//			}
//		}
//	}
//	
//	// After java version 8
//	public void method2(int arg) {
//		int localVariable = 1;
//		//arg = 100;
//		//localVariable = 100;
//		class Inner {
//			public void method() {
//				int result = arg + localVariable;
//			}
//		}
//	}

	String field = "Outter-field";
	void method() {
		System.out.println("OUtter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
