package ch04_2_Repeat_for_while_do_while;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; // declared the variable
		
		int i = 1; //declared another variable. so we have two variable
		
		while(i<=100) { // while i variable is equal or smaller than numerical value 100,
			sum += i; // declared variable called sum goes sum = sum + i
			i++ ; // also variable i increases 1 
			// sum + 1 + 1, sum + 1 + 2, sum + 1 + 3, ......
			//System.out.println(i); // if i get rid of this pseudo code, this shows how two variable increases
			//System.out.println("1~" + (i-1) + " гу : " + sum); // this code also shows the increase on variables
		}
		System.out.println("1~" + (i-1) + " гу : " + sum); // what i want the result to be appeared on console,
		// "1~" + i  = 100 (this happens because i increases upto 100 due to while conditional statement and it adds one due to sum+=i 
		// sum = i + 1 = 2
		// sum = i + 2 = 
	}

}
