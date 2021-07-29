package ch04_2_Repeat_for_while_do_while;

public class PracticeTestCh04_02Q2 {

	public static void main(String[] args) {
		// by using while statement and Math.random method, print the outcome of two dice
		// if the sum of two dice is not numerical value 5, then keep roll the dice.
		// otherwise,  stop the rolling dice. the sum can be come out when it's fdsafsadf
		
		//question 3. i accidently typoed the class name.
		
		// we are cuurently doing for and while... these are the continuous statement... 
		
		while (true) { // we declared that this question will work when it is true. and it will repeat...
			int dice1 = (int) (Math.random()*6) + 1; // we declared the local variable with method "Math.random() in integer type.
			int dice2 = (int) (Math.random()*6) + 1; // we also declared another local variable since we are throwing two dices.
			System.out.println("(" + dice1 + ","+ dice2 + ")"); // we like to print out.. (dice1 , dice2) format in new line.
			
			if ((dice1 + dice2) == 5) {
				System.out.println("(" + dice1 + ","+ dice2 + ")");
				break;
			}
			
			/* the written code below will show the dice rolling until it meets sum 5. i made it up... */
//			
//			if ((dice1 + dice2) != 5) { // simply.. we use "for" as conditional statement. if sum of two dice meets 5, it must break.
//				System.out.println("(" + dice1 + ","+ dice2 + ")");
//			} else {
//				break;
//			}
			
		
		}
		
		
		//		
//		int sum = 0;
//		int d1 = (int)Math.random();
//		int d2 = (int)Math.random();
//		sum = d1 +d2;
//		System.out.println("the sum of two dice has not reached numerical value 5." + sum);
//		while(sum != 5) {
//			if (sum == 5) {
//				break;
//			}
//		}
//		
		// needs to work on this code... quotted on july 28th
		
		
		//System.out.println("the sum of two dice has reached numerical value 5." + sum);
	}
}
