package ch04_1_coditional_if_and_switch_statement;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");			
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");			
			System.out.println("등급은 B입니다.");
		}
	}

}
