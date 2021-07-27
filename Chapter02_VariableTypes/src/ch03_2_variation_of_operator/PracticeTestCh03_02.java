package ch03_2_variation_of_operator;

import java.util.Scanner;

public class PracticeTestCh03_02 {

	public static void main(String[] args) {
//		System.out.println("Question 1. from page 127\n------\n");
//		
//		byte b = 5;
//		//b = -b; // compile error has occured on this section.
//		int x1 = -b; // i switched from b to int x1. then this worked...
//		int result = (10/ x1); // the literal x1 used to be b but i switched. 
//		System.out.println(result);
//
//		System.out.println("Question 2.\n------\n");
//		
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--); // +1 were added on int x= 10... so it's 11 here... and y is 20 before it decreased.
//		System.out.println(z); // therefore it's 31 in total.
//		
//		System.out.println("Question 3.\n------\n");
//		
//		//boolean stop = ;
//		//while ( ) { // while must have ! operator to stop running the program.
//		// }
//	
//		System.out.println("Question 4.\n------\n");
//		int pencils = 534;
//		int students = 30;
//		
//		// how many pencils would be given to a student?
//		
//		int pencilsPerStudent = (pencils /students);
//
//		int pencilsLeft = (pencils % students);
//		System.out.printf("Pencils per Students = %d\n Pencils left overs = %d\n", pencilsPerStudent, pencilsLeft);
//	
//		
//		System.out.println("Question 5.\n------\n");
//		
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = var1/var2; // 2.5
//		//int var4 = (int)(var3 * var2); // this part is wrong. the literal of var3 is 2.5 and 2.5 value shows on double or floats... however, next coding line switched to integer that's why literal changed from 2.5 to 2
//		double var4 = (double)(var3 * var2); //convert from int var4 to double var4.. also changed right side of expression converts to double. 
//		System.out.println(var4);
//
//	
//		System.out.println("Question 6.\n------\n");
//		
//		int value = 356;
//		System.out.println(value/100*100);
//
//		
//		System.out.println("Question 7.\n------\n");
//		
//		float vari1 = 10f;
//		float vari2 =  vari1 / 100;
//		if(var2 !=0.1) { // the conditional statement if's literal has to change from var2 ==0.1 to !=0.1
//			System.out.println("10%입니다.\n");
//		} else {
//			System.out.println("10%가 아닙니다.\n");
//		}
//		
//		
//		System.out.println("Question 8.\n------\n");
//		
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = ((double)lengthTop + lengthBottom)/2 * height; // 7.5 * 7 =  52.5
//		System.out.println(area);		
//		
//		
//		System.out.println("Question 9.\n------\n");
//		
//		Scanner scanner = new Scanner(System.in); // scanner variable has new Scanner literal that has parenthesis. import java.util scanner were aleady decalred in begining.
//		
//		double m1 = 7.3; // variable m1 has double type since the literal stated in decimal value
//		double m2 = 2.5; // same as above
//		double result2 = (double)m1/m2; // put down equation expression on variable section to declare the variable
//		
//		System.out.println("첫 번째 수: "); // print the string literal called "first numerical value: "
//		m1 = Double.parseDouble(scanner.nextLine()); // then... m1 variable needs to be Double.parseDouble format since scanner scans on string variable.
//		System.out.println("두 번째 수: "); // print the string literal called "...."
//		m2 = Double.parseDouble(scanner.nextLine()); // then... m1 variable needs to be Double.parseDouble format since scanner scans on string variable.
//		
//		if (m2 != 0 && m1 ==7.3 && m2==2.5) { // now, let's make condition since the question requested two result based on the variable.
//			System.out.println("-------------------\n결과: " + result2);
//		} else {
//			System.out.println("-------------------\n결과: 무한대");
//		}
//		
//
//		
//		System.out.println("Question 10.\n------\n");
//		
//		
//		int Var1 = 10;
//		int Var2 = 3;
//		int Var3 = 14;
//		//double Var4 = Var1 * Var1 * Var2 + "." + Var3;
//		//String Var4 = (Var1 / Var1 * Var2) + "." + Var3; // this is my anwer... but this won't work since variable stated in String type.
//		double Var4 = Var1 / Var1 * Double.parseDouble(Var2 + "." + Var3);  // textbook answer.
//		System.out.println("원의 넓이: " + Var4);
//	
//		
//		
		System.out.println("Question 11.\n------\n");
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("ID: ");
		String name1 = scanner1.nextLine();

		System.out.print("Password: ");
		String strPassword = scanner1.nextLine();
		int password = Integer.parseInt(strPassword);
		System.out.println(name1);
		if (name1.equals("java")) { // textbook ansjawer...
		//if (name1=="java") {
			if (password == 12345) {
				System.out.println("log-in success");
			} else {
				System.out.println("log-in fail: wrong password");
			}
		} else {
			System.out.println("log-in fail: No ID on data");
		}
		
		
		// my way of trying make the answer...
		//연산자 == 과 equal은 다르다... equal은 string 문자열 자체가 동일한지 확인하지만.. == 주소값을 비슷한지 확인한다
//		if (name1 == "java" && password == 12345 ) { // 
//			System.out.println("log-in success");
//		}	else if (name1 =="java" && password != 12345 ) {
//			System.out.println("log-in fail: wrong password");
//		}
//			else if (name1 != "java" && password == 12345 ) {
//			System.out.println("log-in fail: No ID on data");
//		} else {
//			System.out.println("log-in fail: No ID on data");
//		}
		
		
		System.out.println("Question 12.\n------\n");
		
		int x = 10;
		int y= 5;
		
		System.out.println( (x >7) && (y <=5));
		System.out.println( (x %3 ==2) || (y%2 != 1));

		System.out.println("Question 13.\n------\n");
		
		int value = 0;
		
		value = value + 10; //---> value += 10;
		value = value - 10; //---> value -= 10;
		value = value * 10; //---> value *= 10;
		value = value / 10; //---> value /= 10;
	
		System.out.println("Question 14.\n------\n");
		
		int score = 85;
		String result = (!(score>90)) ? "A" : "B" ;
		System.out.println(result);
		
	}

}
