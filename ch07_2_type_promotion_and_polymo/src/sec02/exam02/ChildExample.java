package sec02.exam02;

	public class ChildExample { // this class is operating class.

		public static void main(String[] args) { //main method was declared to operate something.
			Child child = new Child(); // child variable declared and Reference has used Child class(object)
									   // this constructs child class's method or class/
			Parent parent = child; // we declared parent variable from reference Parent class and it stated parent variable is equal to child.
			parent.method1(); // when parent variable operates method1 from parent-child class, it provides the method from parent
			parent.method2(); // when parent variable operates method2 from parent-child class, this gives the replaced method from child.
			//parent.method3(); //<---- this can't be declared since this variable wasn't declared from parent class. 
			

	}

}
