package method;

public class ControlFlowPractice {

	public static void main(String[] args) {
		// overloading
		add(1, 5);
		add(11, 22);
		add(55, 33);
		
		add(1.5, 3.1);
		System.out.println(5);
		System.out.println(5.5);
	}
	private static void add(double d, double e) {
		System.out.println(d+ e);
	}
	
	
	private static void add(int i , int j) {
		System.out.println(i+j);
	}
}
