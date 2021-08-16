package ch06_4_method;

public class Calc1Example { // this class will operating class

	public static void main(String[] args) {
		Calc myCalc = new Calc(); //myCalc is the variable that has Calc object type. this will construct the Calc class 
		myCalc.powerOn(); //the variable which was constructed Calc class would operate the powerOn method.
		
		int result1 = myCalc.plus(5, 6); // result1 variable was declared in integer type. and this has myCalc variable operates plus method with paramter value.
		System.out.println("result1 : " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}

}
