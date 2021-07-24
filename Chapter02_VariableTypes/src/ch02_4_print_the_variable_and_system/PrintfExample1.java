package ch02_4_print_the_variable_and_system;

public class PrintfExample1 {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이는 %10.2f이다.\n", 10, area);

		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%6d | %-10s | %10s\n", 1, name , job);
		
		
	}

}
