package ch06_4_method;

public class CalculatorExample1 {

	public static void main(String[] args) {
		Calculator1 myCalcu = new Calculator1();
		
		//Calculating the width of perfect square
		double result1 = myCalcu.areaRectangle(10);
		
		//Calculating the width of rectangle
		double result2 = myCalcu.areaRectangle(10,20);

		System.out.println("width of perfect square = " + result1 );
		System.out.println("width of rectangle = " + result2);
	}

}
