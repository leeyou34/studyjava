package sec01.exam03;

	public class Computer extends Calculator{ // Computer object(class) is child class of Calculator(parent class)
		//method
		@Override
		double areaCircle(double r) { // method was overrode
			System.out.println("operates the areaCircle() from Computer object"); 
			return Math.PI * r * r;
		}
	}
