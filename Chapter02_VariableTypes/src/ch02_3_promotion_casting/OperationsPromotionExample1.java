package ch02_3_promotion_casting;

public class OperationsPromotionExample1 {

	public static void main(String[] args) {
		
		//	[정수 연산에서의 자동타입 변환
		
		byte byteValue1 = 10, byteValue2 = 20;
		int result = byteValue1 + byteValue2;
//		byte result = byteValue1 + byteValue2;
//		byte result = (byte)(byteValue1 + byteValue2);
							//int int
		System.out.println(result);
		
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
//		char charValue3 = (char)(charValue1 + charValue2);
		int charValue3 = charValue1 + charValue2;
		
		System.out.println(charValue3);
		
		
		int intValue3 =10;
		int intValue4 = intValue3/4;
		
		System.out.println(intValue4);
		
		
		int intValue5 = 10;
//		int intValue6 = 10/4.0;
		int intValue6 = (int) (intValue5/((double)4.0)); // -> 다시한번 확인 해 볼 것.
//		double doubleValue = intValue5 / 4.0;
		
		System.out.println(intValue6);
		
		
				
	
	}

}
