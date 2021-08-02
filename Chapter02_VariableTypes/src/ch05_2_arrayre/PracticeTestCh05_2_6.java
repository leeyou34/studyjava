package ch05_2_arrayre;

import java.util.Scanner;

public class PracticeTestCh05_2_6 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1. number of students | 2. press the score | 3. score list | 4. Anaysis | 5.End");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Select >");
		
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1 ) {
				//
				System.out.print(" number of students");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo ==2) {
				//
				for (int i = 0; i <scores.length; i++) {
					System.out.print("scores[" + i +"] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo ==3) {
				//
				for (int i = 0; i <scores.length; i++) {				
					System.out.print("scores[" + i +"]: " + scores[i]);
				}
			} else if(selectNo ==4) {
				//
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i =0; i <scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum+=scores[i];
				}
				avg = (double) sum /studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo ==5) {
				run = false;
			} 
		}
		
		System.out.println("End of program");	
	}
}
