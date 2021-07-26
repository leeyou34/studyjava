package ch03_2_variation_of_operator;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2+1; // If char variable uses on arthimatic operation, it promotes to integer type. therefore, operation result turns out to be integer type. 
		char c3 = (char)(c2+1); // if values on the right side declares (char) type precisely, then the result will shows char type.
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
				

	}

}
