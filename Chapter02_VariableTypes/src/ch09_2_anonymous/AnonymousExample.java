package ch09_2_anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//use the Anonymous object field.
		anony.field.wake();
		//use the Anonymous object local variable.
		anony.method1();
		//using Anonymous object parameter value.
		anony.method2(
				new Person() {
					void study() {
						System.out.println("Let's study.");
					}
					@Override
					void wake() {
						System.out.println("Waking up at 8 o'clock.");
						study();
					}
				}
			);
	}
}
