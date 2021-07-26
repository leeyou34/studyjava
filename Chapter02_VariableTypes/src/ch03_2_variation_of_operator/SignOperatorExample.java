package ch03_2_variation_of_operator;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		byte b =100;
		//byte result3 = -b; -> compile error. if this code needs to be worked, it has to be...
		//byte result3 = (byte)-b;
		int result3 = -b;
		System.out.println("result3= " + result3);
		
		
	}

}
