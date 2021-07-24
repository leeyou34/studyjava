package ch02_3_promotion_casting;

public class StringConcatExample1 {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("value: " + str1);

		String str2 = 10 + "2" + 8;
		System.out.println("value: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("value: " + str3);
		
		String str4 = "10" + (2+ 8);
		System.out.println("value: " + str4);
		
		
	}

}
