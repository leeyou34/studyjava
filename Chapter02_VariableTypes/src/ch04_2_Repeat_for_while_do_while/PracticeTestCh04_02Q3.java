package ch04_2_Repeat_for_while_do_while;

public class PracticeTestCh04_02Q3 {

	public static void main(String[] args) {
		//This is question 4. i accidently typoed the question number.
		
		// by using 중첩for continuous statment, find all possible solution for equation 4x + 5y = 60
		// and print in x,y format.
		// however, x and y are integer type and it is smaller than 10 (x,y<=10)
		
		// we need two variable to find out the conclusion.
		// so inital expression for x should be 1. it's because the question stated that it's natural number.
		
		for (int x=1; x<=10; x++) { // inital variable starts at 1 and it goes up to 10 and it goes up by 1 until...
			for (int y=1; y<=10; y++) { // y value is increasing by 1 until it reach 10...
				if((4*x + 5*y)==60) { //
					System.out.println("(" + x + ", " + y +")");
				}
				}
		}

	}

}
