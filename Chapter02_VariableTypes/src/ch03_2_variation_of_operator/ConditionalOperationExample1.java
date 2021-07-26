package ch03_2_variation_of_operator;

public class ConditionalOperationExample1 {

	public static void main(String[] args) {
		int score =85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

		// the below coding work is exactly same as above code. 
		// i used if, else if, and else conditional statement to command java program to run in args.
		char grade1;
		if (score >= 90) {
			grade1 = 'A';
		} else if (score >= 80 && score < 90) {
			grade1 = 'B';
		} else if (score >= 70 && score < 80) {
			grade1 = 'C';
		} else {
			grade1 = 'F';
		}
		
		System.out.println(score + "점은 " + grade1 + "등급입니다.");
	
		// below is the coding work i tried and stuck... in order for the below coding to be worked. grade2 variable has to be initalized.
//		char grade2 =0;
//		if (score >= 90) {
//			grade1 = 'A';
//		} else if (score >= 80 && score < 90) {
//			grade1 = 'B';
//		} else if (score >= 70 && score < 80) {
//			grade1 = 'C';
//		} 
//		
//		System.out.println(score + "점은 " + grade1 + "등급입니다.");
	
	}
}
