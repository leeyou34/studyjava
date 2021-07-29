package ch04_2_Repeat_for_while_do_while;

public class PracticeTestCh04_02Q5 {

	public static void main(String[] args) {
		//question 5 from chap04_02
		
		// print the star that makes pyramid shape from left side.
		
		
		
		for (int i = 1; i < 5; i++) { // variable i starts at 1 and it increase 1 upto 4...
			for (int j =1; j<= i; j++) { // j also starts at 1.. and it incrases 1 as i goes...
				System.out.print("*"); // then j must print star...
				if (j == i) { // if j equals to i, do the following action below. 
					System.out.println();
				}
			}
		}

	}

}
