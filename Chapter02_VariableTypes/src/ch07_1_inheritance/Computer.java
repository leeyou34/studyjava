package ch07_1_inheritance;

	public class Computer extends Calculator{
		@Override
		double areaCircle(double r) {
			System.out.println("operates the areaCircle() from Computer object");
			return Math.PI * r * r;
		}
	}
