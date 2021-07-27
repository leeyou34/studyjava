package ch04_1_coditional_if_and_switch_statement;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
				break;
			case 9:
				System.out.println("회의합니다.");
				break;
			case 10:
				System.out.println("업무를 봅니다.");
				break;
			case 11:
				System.out.println("외근을 나갑니다.");
				break;
		}
		

	}

}
