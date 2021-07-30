package ch05_2_arrayre;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum must be declared as 0... for ex) int sum = 0;
		int[] scores = { 97, 71, 84, 93, 87};
		
		
		int sum = 0;
		for(int score: scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum/ scores.length;
		System.out.println("점수 평균= " + avg);
		
	}

}
