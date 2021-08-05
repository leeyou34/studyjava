package ch07_2_type_change_and_various;

	public class ChildExample {

		public static void main(String[] args) {
			Child child = new Child();
			
			Parent parent = child;
			parent.method1();
			parent.method2();
			//parent.method3(); //<---- this can't be declared since this variable wasn't declared from parent class. 
			

	}

}
