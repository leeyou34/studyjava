package ch02_3_promotion_casting;

public class PrimitiveAndStringConversionExample1 {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		// 07.23.15:25 value에 대해 강사가 설명함
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.SIZE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
//		[실무에서 많이 쓰이는 강제타입변환]
//		
//		"문자열" -------------> 숫자
//			   <-------------
//		
//		숫자         <------------- 문자열
//		int value = Integer.toString(value) + "8";
//		System.out.println(str);
//	
//		문자열      <------------- 숫자
//		String str = Integer.toString(value)+"8";
//		str = String.valueOf("100" + 1);
		
//		
		
		// TODO Auto-generated method stub

	}

}
