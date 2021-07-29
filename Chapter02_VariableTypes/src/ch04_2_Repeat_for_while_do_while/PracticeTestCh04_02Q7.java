package ch04_2_Repeat_for_while_do_while;

import java.util.Scanner;

public class PracticeTestCh04_02Q7 {

	public static void main(String[] args) {
		// Question 7.
		/************************************
		 * using while conditional statement and Scanner method, write the code that provides deposit, withdrawal, Inquiry, 
		 * end function when someone press the data by keyboard...
		 * method "scanner.nextLine() should be used...
		 * 
		 * 
		 ************************************/
		
		boolean run = true; // variable called run is boolean type... therefore, it must come out as either true or false.
							// we don't need false at the beginning...
		int balance = 0; // every account's balance should starts at 0. the balance changed depends on the action...
		
		Scanner scanner = new Scanner(System.in); // for java program to search the variables to do some action. this is class.
		
		while (run) { // while variable "run" is on...
			System.out.println("--------------------------------------------------------");
			System.out.println("1. Deposit | 2. Withdrawal | 3. Account inquiry | 4. End");
			System.out.println("--------------------------------------------------------");
			System.out.println("Select > "); // print these strings on consol. this will repeat when user choose the function.
											//user must choose one of number from top.
			int menuNum = Integer.parseInt(scanner.nextLine()); //whatever scans... it will be appear on integer type with menuNum variable
			
			switch (menuNum) { // since this question ask about, string format.. we gotta use switch...
			case 1: // in order to operate this case... user must type 1.
				System.out.println("Deposit ammount>"); // this line will appear
				balance += Integer.parseInt(scanner.nextLine()); // balance = balance + scanned number...
				break;
			
			case 2:
				System.out.println("Withdrawal ammount>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
				
			case 3:
				System.out.println("Account inquiry>");
				System.out.println("Balance:" + balance);
				break;
				
			case 4:
				run = false;
				System.out.println();
				break;
			}
			System.out.println();
		}
		System.out.println("End of the program");
	
	
	}

}
