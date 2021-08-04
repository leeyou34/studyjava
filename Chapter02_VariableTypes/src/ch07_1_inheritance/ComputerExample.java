package ch07_1_inheritance;

public class ComputerExample {

	public static void main(String[] args) {
		int r =10;
		
		Calculator calculator = new Calculator();
		System.out.println("area of circle: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("area of circle: " + computer.areaCircle(r));

	}

}
