package ch05_2_arrayre;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int [] oldIntArray = {1, 2, 3};
		int [] newIntArray = new int[5];

//		System.out.println(oldIntArray[0]);
//		oldIntArray[0] = 0;
//		System.out.println(oldIntArray[0]);

		
		//반드시 넣어야 하는 상황
		
		// 더 큰 배열을 만들어서 이전 배열 요소를 전부 복사
		// oldIntArray[3] = 4;
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		oldIntArray = newIntArray;
		oldIntArray[3] = 4;
		oldIntArray[4] = 5;
		
		int size = 0;
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		System.out.println();
		System.out.println("배열크기는 : " + oldIntArray.length);

	}

}
