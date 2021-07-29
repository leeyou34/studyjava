package ch05_2_arrayre;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
//		int[] scores;
//		scores = new int[]{83, 90, 87};
//		
//		int sum1 = 0;
//		for(int i = 0; i<3; i++) {
//			sum1 =+ scores[i];
//		}
//		System.out.println("총합 : " + sum1);
	
		
		
		int sum2 = add(/*0xBC123*/ new int[]{83,90,87}); // instructor types thid code to explain how that text shows...
		//int sum2 = add( new int[]{83,90,87});
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	// add(3,7)
	private static int add(int[] scores) { // int[] scores 배렬의 참조를 가지고 있는 변수...
		int sum = 0;
		for(int i = 0; i <3; i++) {
			sum+= scores[i];
		}
		return sum;
	}

}
