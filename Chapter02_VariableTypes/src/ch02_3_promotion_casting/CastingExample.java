package ch02_3_promotion_casting;

public class CastingExample { //CastingExample이라고 강제타입예제 클래스를 선언한다. 이 클래스는 패키지 ch02_3_promotion_casting에 소속되어있다.
	public static void main(String[] args) { // 문자열 형식의 논의 고정되어있는 빈 메인 메소드를 선언한다. 
		int intValue = 44032; // intValue라는 정수형 변수는 44032라는 값을 가진다.
		char charValue = (char) intValue; // charValue라는 문자형 변수는 intValue라는 정수형 변수를 문자형으로 강제타입 변환한다.
		System.out.println(charValue); // 새로운행에 charValue를 출력하라.
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
