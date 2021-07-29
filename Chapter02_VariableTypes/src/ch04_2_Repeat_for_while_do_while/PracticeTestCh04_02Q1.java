package ch04_2_Repeat_for_while_do_while;

public class PracticeTestCh04_02Q1 {

	public static void main(String[] args) {
		// Question 2.... i accidently typoed...
		// using for statement, there is integer starts from 1 to 100.
		// create the sum of multiplication of numerical value 3.
		int sum = 0; // there are two variable that needs to be solved... in conclusion, we do want to know the sum of this question.
		for(int i =1; i <= 100; i++) { //first, there is a variable condition that integer is from 1 to 100...
			if (i%3 ==0) { // 
				sum+=i;
		}
	}
		System.out.println("total sum of multiplication" + sum);
}
}