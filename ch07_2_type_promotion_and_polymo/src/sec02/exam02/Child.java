package sec02.exam02;

	public class Child extends Parent{ // this Child class is connected to Parent class. it's part of api
		//method
		@Override
		public void method2() { // method2 would override the parent class method 2 when request this method2.
			System.out.println("Child-method2()"); // this code is redefined.
		}	
		public void method3() { // method2 method would be operated public(can fix and use) and provides no return
			System.out.println("Child-method3()");
		}
	}
