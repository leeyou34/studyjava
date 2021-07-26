package ch03_2_variation_of_operator;

public class Test20 {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		boolean result;
		
		//num1 = num1 + 10
		//sum = sum + 
		
		result = ((num1 += 10) < 0 && (num2 += 10) > 0);
		System.out.printf("num1 = %d, num2 = %d\n\n", num1 , num2);

		result = ((num1 += 10) > 0 || (num2 +=10) > 0);
		System.out.printf("num1 = %d, num2 = %d", num1, num2);
	}

}
