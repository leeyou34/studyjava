package object;

public class HashCodeOrg {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		String str3 = "Hello";
		String str4 = "Hello";

		System.out.println(str1 == str2);
		System.out.println("abc" == "abc");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());


		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
	}

}
