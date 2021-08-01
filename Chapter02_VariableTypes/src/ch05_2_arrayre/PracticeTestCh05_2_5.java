package ch05_2_arrayre;

public class PracticeTestCh05_2_5 {

	public static void main(String[] args) {
		// question 5.
		int [][] array = { // we have declared the "array" variable in integer type that has three index of array.
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0; // since we want the solution to be print out in the end... we need to declare the variable and it should be initalized
		double avg = 0.0; // same as above...
		
		// code writing...
		
		int count = 0; // let's call count variable and initalizing it.
		for( int i = 0; i < array.length; i++ ) { // i is similar to x...  
			for (int j =0; j < array[i].length; j++) {// j is similar to y...
				sum += array[i][j];
				count++; // count upto 10
			}
		}
		avg = (double) sum / count;
		
		//System.out.println("count: " + count);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		

	}

}
