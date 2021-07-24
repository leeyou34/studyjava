package ch02_3_promotion_casting;


public class PromotionExample1 { // 자동변환예제라는 클래스를 선언한다. 이 클래스는 package ch02_3_promotion_casting에 있다.

	public static void main(String[] args) { // 문자열 형식의 리터럴을 지닌 메인 메소드를 선언한다.
		byte byteValue = 10; // 1byte크기를 가지고 있는 byte형태의 변수 byteValue를 선언하고 그 변수에 대한 리터럴은 10이다.
		int intValue = byteValue; //4byte크기를 가지고 있는 정수 형태의 변수 intValue를 선언하고 그 변수에 대한 리터럴은 byteValue이다. byteValue변수는 byte형태입으로 자동적으로 타입이 변환한다.
		System.out.println(byteValue); // 리터럴(값) byteValue를 새로운 행에 출력하라.
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);

	}

}
