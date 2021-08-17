package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r =10; // local variable is declared in interger type and it has value 10.
		
		Calculator calculator = new Calculator(); // this constructs the Calculator class
		System.out.println("area of circle: " + calculator.areaCircle(r)); // print the string and the variable calculator's method
		System.out.println();
		
		Computer computer = new Computer(); // this constructs the Calculator 
		System.out.println("area of circle: " + computer.areaCircle(r)); // print the string and variable computer's method.

	}

}
