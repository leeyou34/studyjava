package ch08_2_type_promotion_and_polymor;

public class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("Taxi is on move.");
	}
}