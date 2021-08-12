package ch10_2_exception_handling;

public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("lack of operating parameter value.");
		} catch(Exception e) {
			System.out.println("There is pronblem for operation.");
		} finally {
			System.out.println("please, try operating again.");
		}

	}

}
