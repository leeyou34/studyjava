package ch04_2_Repeat_for_while_do_while;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i=1; i<=100; i++) { // int i = 1 is the inital expression... then we put semi colon to finish the expression. after first inital expression, we put conditional statement expression, then lastly we put increase operater to finish this "for"statement
			sum += i;
			System.out.println("i~" + (i+1) + "гу : " + sum);
		}
	}
		
}
