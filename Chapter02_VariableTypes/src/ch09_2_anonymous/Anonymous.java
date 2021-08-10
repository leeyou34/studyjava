package ch09_2_anonymous;

public class Anonymous {
	// Substitute for field initalized value
	Person field = new Person() {
		void work() {
			System.out.println("Check-in for work.");
		}
		@Override
		void wake() {
			System.out.println("Waking up at 6 o'clock.");
			work();
		}
	};
	
	void method1() {
		// substitute for local variable value
		Person localVar = new Person() {
			void walk() {
				System.out.println("Taking a trail.");
			}
		@Override
		void wake() {
			System.out.println("Waking up at 7 o'clock.");
			walk();
			}
		};
		// local variable usage
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}



