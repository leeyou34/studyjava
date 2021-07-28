package ch04_2_Repeat_for_while_do_while;

public class PracticeTestCh04_02Q2 {

	public static void main(String[] args) {
		// by using while statement and Math.random method, print the outcome of two dice
		// if the sum of two dice is not numerical value 5, then keep roll the dice.
		// otherwise,  stop the rolling dice. the sum can be come out when it's fdsafsadf
		
		int sum = 0;
		int d1 = (int)Math.random();
		int d2 = (int)Math.random();
		sum = d1 +d2;
		System.out.println("눈의 합이 5가 나왔습니다." + sum);
		while(sum != 5) {
			if (sum == 5) {
				break;
			}
		}
		
		
		
		
		System.out.println("눈의 합이 5가 나왔습니다." + sum);
	}
}
