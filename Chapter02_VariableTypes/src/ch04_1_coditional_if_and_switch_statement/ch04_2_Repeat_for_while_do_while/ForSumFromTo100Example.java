package ch04_2_Repeat_for_while_do_while;

public class ForSumFromTo100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i <=100; i++) {
			sum += i; // this is equal to sum = sum + i
		}
		System.out.println("Sum from 1 ~ 100 : " + sum);
	}

}
