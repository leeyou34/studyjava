package ch03_2_variation_of_operator;

public class PracticeTestCh03_02 {

	public static void main(String[] args) {
		System.out.println("Question 1. from page 127\n------\n");
		
		byte b = 5;
		//b = -b; // compile error has occured on this section.
		int x1 = -b; // i switched from b to int x1. then this worked...
		int result = (10/ x1); // the literal x1 used to be b but i switched. 
		System.out.println(result);

		System.out.println("Question 2.\n------\n");
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // +1 were added on int x= 10... so it's 11 here... and y is 20 before it decreased.
		System.out.println(z); // therefore it's 31 in total.
		
		System.out.println("Question 3.\n------\n");
		
		//boolean stop = ;
		//while ( ) { // while must have ! operator to stop running the program.
		// }
	
		System.out.println("Question 4.\n------\n");
		int pencils = 534;
		int students = 30;
		
		// how many pencils would be given to a student?
		
		int pencilsPerStudent = (pencils /students);

		int pencilsLeft = (pencils % students);
		System.out.printf("Pencils per Students = %d\n Pencils left overs = %d\n", pencilsPerStudent, pencilsLeft);
	
		
		System.out.println("Question 5.\n------\n");
		
		int var1 = 5;
		int var2 = 2;
		double var3 = var1/var2; // 2.5
		//int var4 = (int)(var3 * var2); // this part is wrong. the literal of var3 is 2.5 and 2.5 value shows on double or floats... however, next coding line switched to integer that's why literal changed from 2.5 to 2
		double var4 = (double)(var3 * var2); //convert from int var4 to double var4.. also changed right side of expression converts to double. 
		System.out.println(var4);

	
		System.out.println("Question 6.\n------\n");
		
		int value = 356;
		System.out.println(value/100*100);

		
		System.out.println("Question 7.\n------\n");
		
		float vari1 = 10f;
		float vari2 =  vari1 / 100;
		if(var2 !=0.1) { // the conditional statement if's literal has to change from var2 ==0.1 to !=0.1
			System.out.println("10%입니다.\n");
		} else {
			System.out.println("10%가 아닙니다.\n");
		}
		
		
	}

}
