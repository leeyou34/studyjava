package ch02_3_promotion_casting;

public class PromotionExample {
	//PromotionExample이라는 클래스를 선언한다. 자고로 이 클래스는 ch02_3_promotion_casting이라는 패키지 내부에 있다.
	public static void main(String[] args) { // 문자열 형태 논의의 고정형 메인 메소드를 선언한다.  
		byte byteValue = 10; // byteValue라고 불리는 byte형태의 정수형 변수는 10의 값을 가진다. 
		int intValue = byteValue; // intValue라고 불리는 int 형태의 정수형 변수는 곧 byteValue 변수와 동일하다.
		System.out.println("intValue: " + intValue); // 새로운 행에 다음과 같이 "intValue:" + intValue값를 출력하라.
		
		char charValue ='가'; //charValue라는 정수타입의 char(문자)형 변수는 '가'의 값을 가진다.
		intValue = charValue; // 변수 intValue는 곧 변수 charValue과 동일하다.
		System.out.println("가의 유니코드: " + intValue); // 새로운 행에 다음과 같이 "가의 유니코드: " + intValue값를 출력하라.
		
		intValue =50; //변수 intValue는 50의 값을 가진다.
		long longValue = intValue; //longValue라는 정수형 변수는 곧 intValue와 동일하다.
		System.out.println("longValue: " + longValue); // 새로운행에 다음과 같이 "longValue: " + longValue값을 출력하라.
		
		longValue = 100; //변수 longValue는 100의 값을 가진다.
		float floatValue = longValue; //floatValue라는 실수타입의 변수는 곧 longValue라는 정수형 변수와 동일하다.
		System.out.println("floatValue: " + floatValue);// 새로운행에 다음과 같이 "floatValue: " + floatValue값을 출력하라.
		
		floatValue = 100; //변수 floatValue는 100의 값을 가진다.
		double doubleValue = floatValue; //doubleValue라는 실수타입의 변수는 곧 floatValue라는 실수타입 변수와 동일하다.
		System.out.println("doubleValue: " + doubleValue); //새로운행에 다음과 같이 "doubleValue: " + doubleValue값을 출력하라.
		
//
// 타입(자료형) 변환에는 두가지 형태로 구분 된다.
// 	1. 자동(묵시적) : This calls promotion, 자바는... literal(값)을 30으로 한다면. 자료형을 int(정수)로 인식한다. 컴파일러...
// 	2. 강제(명시적) : This calls conversion, 
// 
// 	literal(값) 허용범위가 큰 타입 = 작은타입 (byte, short, int, long, float, double)
// 	for example) 
//	 "값 손실"... losing literal
//	byte bv = 100; -> byte의 최대값은 127임으로. 100까진 괜찮다.
//	int  iv = bv;  
//
//
//

//		int   iv = 9;
//		long  lv = 999_999_999_999_999_9L;
//		float fv = 9.0f;
	}

}
