package ch05_1_reference_variable;

public class StringEqualExample {

	public static void main(String[] args) {
//		System.out.println("a");
//		System.out.println("b");
//		System.out.println("c");
//		System.out.println("d");
//		System.out.println("e");
//		System.out.println("f");
//		return;
		String str1 = "java";
		String str2 = "java";
		String str3 = new String ("java");
		String str4 = new String ("java");
		
		
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4)); // 문자열을 선언할 때는... 

		
		
		//A a1 = new A();
		A a1;
		a1 = new A();
		
		
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		System.out.println("프로그램 종료");
	}
}
	class A {
	int a = 1;
	int b = 2;
	
}

