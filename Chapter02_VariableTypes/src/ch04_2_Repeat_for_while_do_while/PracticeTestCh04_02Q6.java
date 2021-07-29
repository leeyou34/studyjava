package ch04_2_Repeat_for_while_do_while;

public class PracticeTestCh04_02Q6 {

	public static void main(String[] args) {
		// Question 6.
		
		// we are going to make star pyramid from right side...
		// this code needs to practice to figure out...
		
		
		for (int i =1; i < 5; i++) { // i is on increase... and it will make new line...
			for (int j =4; j > 0; j--) { // however j starts at 4 and it will decrease... 
				if (i < j) { //
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

//		for (int i = 1; i < 5; i++) { // variable i starts at 1 and it increase 1 upto 4...
//			for (int j =1; j<= i; j++) { // j also starts at 1.. and it incrases 1 as i goes...
//				System.out.print("*"); // then j must print star...
//				if (j == i) { // if j equals to i, do the following action below. 
//					System.out.println();