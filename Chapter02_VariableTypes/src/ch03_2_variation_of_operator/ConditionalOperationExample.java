package ch03_2_variation_of_operator;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		
		
		//int keyCode;   ------> 오전에 강사를 따라 코드 쳤음.. 7월 26일 오전 10:56분
//		while (true) {
//			try {
//				System.out.printf("keyCode: %d\n", System.in.read());
//			} catch ( IOException e) {
//				e.printStackTrace();
//			}
//		} // ----->
//		
//		System.out.println("프로그램이 정상적으로 종료되었습니다.");
//	}
	}
}

	