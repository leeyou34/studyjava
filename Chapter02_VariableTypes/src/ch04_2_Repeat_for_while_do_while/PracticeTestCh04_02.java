package ch04_2_Repeat_for_while_do_while;

public class PracticeTestCh04_02 {

	public static void main(String[] args) {
		// question 5.

//		for(int x =0; x <= 4 ; x++) {
//			for(int y= 0; y <=x; y++) {
//				System.out.print("*");
//		}
//			System.out.println();
//		}
		
		for(int xe =0; xe <= 4 ; xe++) {
			for(int ye= 0; ye <=xe; ye++) {
				System.out.printf("%-4s","*");
		}
			System.out.printf("%s","\n");
		
	}

	}
}
