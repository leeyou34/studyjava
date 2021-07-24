package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x +", y:" + y);
		
		int temp = x;
		x = y;
		y = x;
		System.out.println("x:" + x +", y:" + y);

		int hour = 3;
		int minute = 5;
		int totalMinute = (hour*60) + minute;
		System.out.println("ÃÑ" + totalMinute + "ºÐ");
		
	}
}
