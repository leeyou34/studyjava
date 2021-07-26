package ch03_2_variation_of_operator;

public class CompareOperatorExample1one {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.printf("result1 = %b \nresult2 = %b \nresult3 = %b \n", result1, result2, result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.printf("result4 = %b \n", result4);

	}

}
