package sec02.exam01;
	/*********************** 
	* this section is allows variable to be used anytime.
	* below section upto public class promotionexample, this stated the composition of the class.
	* parents to child.
	* below declared class are API type library.
	*************************/
	class A {} // object A is parent class
	
	class B extends A {} // Class B is child class of A. it is stated as 'extends'
	class C extends A {} // class C is child class of A
	
	class D extends B {} // class D is child class of B
	class E extends C {} // class E is child class of C
	
	// we don't have source file of B,C,D,E but we do construct these objects.
	
	//class Myclass {} //<--- this was written for trying something during the class.
	
	public class PromotionExample { // promotionexample class is declared and this would be operating class
		public static void main(String [] args ) { // this is the main method that would operate the code
			B b = new B(); //we used b variable B object to constructs the B field, method 
			C c = new C(); //we used bc variable B object to constructs the C field, method 
			D d = new D(); 
			E e = new E();
		
			//Myclass my = new Myclass();
	
			
			
			A a1 = b;
			A a2 = c;
			A a3 = d;
			A a4 = e;

			B b1 = d;
			C c1 = e;
			
			//B b3 = e; // <---- this doesn't follow the inherited.
			//C c2 = d;
	}
}
