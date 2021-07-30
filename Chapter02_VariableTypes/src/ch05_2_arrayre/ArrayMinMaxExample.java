package ch05_2_arrayre;

public class ArrayMinMaxExample {

	public static void main(String[] args) {
		// works during the morning time.
		// 어떤 1차원 배열 선언, 구현된 매서드 call해서 사용하는 코드
		int[] arr= {1,2,3,4,5,6,7};
		
		System.out.println("최소값: " + minValue(arr));
		System.out.println("최소값: " + maxValue(arr));
	}
	public static int maxValue(int[] ar ) {
		int maxNum = ar[0]; //1
		for(int i =0; i <ar.length; i++) {
			if (ar[i] > maxNum) {
				maxNum = ar[i];
			}
		}
		return maxNum;
	}
	public static int minValue(int[] ar) {
		int minNum = ar[0]; //1
		for(int i =0; i <ar.length; i++) {
			if (ar[i] > minNum) {
				minNum = ar[i];
			}
		}
		return 0;
	}
}
