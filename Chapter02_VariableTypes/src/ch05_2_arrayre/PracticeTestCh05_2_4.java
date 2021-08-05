package ch05_2_arrayre;

public class PracticeTestCh05_2_4 {

	public static void main(String[] args) {
		// Question 3.
		// multi-dimensional array must has two bracket... ex) int [][] array...
//		int [][] array = { // there are two array on this integer type "array" variable and the literal are listed below. 
//				{95, 86}, 
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		System.out.println(array[0].length); // this 0th array has two array
//		System.out.println(array.length); // arrary.length shows how many arrays ere listed on the field. there are three arrays are mentioned. therfore, it's 3.
//		System.out.println(array[1].length); // this 1st array has 3 length
//		System.out.println(array[2].length); // this 2nd array has 5 length.
//	}
//}		
//		//question 4.
		int max = 0; // let's declare max variable in integer type to be initalize... it's because we want to know the right value when we print
		int[] array = {1,5,3,8,2}; // it's mono dimensional arrary. this variable "array" is in integer type and has 5 values.
		
		// coding location... and we gotta build up the strategy to find out 
		for (int i = 0; i <array.length; i++) { // let's declare local variable and initialize it. And put the conditional statement, then put increasement. 
			if (max < array[i]) { // condition wise... if max is smaller than array index i value, it's max the max of array i's index
				max = array[i];
			} // the conditional statement has finished and we don't have any task for requesting.
		}
		
		System.out.println("max: " + max); // print...
	}
}
