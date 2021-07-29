package ch02_3_promotion_casting;

public class PromotionExample {
	//PromotionExample�̶�� Ŭ������ �����Ѵ�. �ڰ�� �� Ŭ������ ch02_3_promotion_casting�̶�� ��Ű�� ���ο� �ִ�.
	public static void main(String[] args) { // ���ڿ� ���� ������ ������ ���� �޼ҵ带 �����Ѵ�.  
		byte byteValue = 10; // byteValue��� �Ҹ��� byte������ ������ ������ 10�� ���� ������. 
		int intValue = byteValue; // intValue��� �Ҹ��� int ������ ������ ������ �� byteValue ������ �����ϴ�.
		System.out.println("intValue: " + intValue); // ���ο� �࿡ ������ ���� "intValue:" + intValue���� ����϶�.
		
		char charValue ='가'; //charValue��� ����Ÿ���� char(����)�� ������ '��'�� ���� ������.
		intValue = charValue; // ���� intValue�� �� ���� charValue�� �����ϴ�.
		System.out.println("���� �����ڵ�: " + intValue); // ���ο� �࿡ ������ ���� "���� �����ڵ�: " + intValue���� ����϶�.
		
		intValue =50; //���� intValue�� 50�� ���� ������.
		long longValue = intValue; //longValue��� ������ ������ �� intValue�� �����ϴ�.
		System.out.println("longValue: " + longValue); // ���ο��࿡ ������ ���� "longValue: " + longValue���� ����϶�.
		
		longValue = 100; //���� longValue�� 100�� ���� ������.
		float floatValue = longValue; //floatValue��� �Ǽ�Ÿ���� ������ �� longValue��� ������ ������ �����ϴ�.
		System.out.println("floatValue: " + floatValue);// ���ο��࿡ ������ ���� "floatValue: " + floatValue���� ����϶�.
		
		floatValue = 100; //���� floatValue�� 100�� ���� ������.
		double doubleValue = floatValue; //doubleValue��� �Ǽ�Ÿ���� ������ �� floatValue��� �Ǽ�Ÿ�� ������ �����ϴ�.
		System.out.println("doubleValue: " + doubleValue); //���ο��࿡ ������ ���� "doubleValue: " + doubleValue���� ����϶�.
		
//
// Ÿ��(�ڷ���) ��ȯ���� �ΰ��� ���·� ���� �ȴ�.
// 	1. �ڵ�(������) : This calls promotion, �ڹٴ�... literal(��)�� 30���� �Ѵٸ�. �ڷ����� int(����)�� �ν��Ѵ�. �����Ϸ�...
// 	2. ����(�����) : This calls conversion, 
// 
// 	literal(��) �������� ū Ÿ�� = ����Ÿ�� (byte, short, int, long, float, double)
// 	for example) 
//	 "�� �ս�"... losing literal
//	byte bv = 100; -> byte�� �ִ밪�� 127������. 100���� ������.
//	int  iv = bv;  
//
//
//

//		int   iv = 9;
//		long  lv = 999_999_999_999_999_9L;
//		float fv = 9.0f;
	}

}
