package ch02_3_promotion_casting;


public class PromotionExample1 { // �ڵ���ȯ������� Ŭ������ �����Ѵ�. �� Ŭ������ package ch02_3_promotion_casting�� �ִ�.

	public static void main(String[] args) { // ���ڿ� ������ ���ͷ��� ���� ���� �޼ҵ带 �����Ѵ�.
		byte byteValue = 10; // 1byteũ�⸦ ������ �ִ� byte������ ���� byteValue�� �����ϰ� �� ������ ���� ���ͷ��� 10�̴�.
		int intValue = byteValue; //4byteũ�⸦ ������ �ִ� ���� ������ ���� intValue�� �����ϰ� �� ������ ���� ���ͷ��� byteValue�̴�. byteValue������ byte���������� �ڵ������� Ÿ���� ��ȯ�Ѵ�.
		System.out.println(byteValue); // ���ͷ�(��) byteValue�� ���ο� �࿡ ����϶�.
		
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
