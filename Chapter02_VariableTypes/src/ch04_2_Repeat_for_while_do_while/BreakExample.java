package ch04_2_Repeat_for_while_do_while;

public class BreakExample { // we declared the class called BreakExample. this is under package...

	public static void main(String[] args) { // this class uses method called main and it allows strings args
		while (true) { // while the condition is true, local variable num that has integer type has... Math.random method
			int num = (int)(Math.random()*6)+1; // the integer has Math.random method with *6 blah blah with integer type
			System.out.println(num); // we want the numerical value randomly...
			if(num==6 ) { // Condition wise, if num variable is equal to 6, then break(get out)from the condition.
				break;
			}
		}
		System.out.println("프로그램 종료"); // then print the according strings.
	}

}
