package ch03_2_variation_of_operator;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2+1; // If char variable uses on arthimatic operation, it promotes to integer type. therefore, operation result turns out to be integer type. 
		char c3 = (char)(c2+1); // if values on the right side declares (char) type precisely, then the result will shows char type.
		int c4 = c2+1; // i made up this part in case if i forgot how to do promotion.
		char c5 = (char)c4; // i applied conversion on this 
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4); // made up code
		System.out.println("c5: " + c5); // made up code
				

	}

}
