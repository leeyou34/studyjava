package method;

public class Test04WithInstructor {

	public static void main(String[] args) {
		// 자연수 1부터 시작.. 모든 홀수를 더해.. 그합이 언제(몇을 더했을 때)
		// 1000을 넘어서는지?, 그리고 1000을 넘어선 값은 얼마?
		// 출력하는 프로그램을 작성하시오
		// (while문, break 사용
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			// 홀수 조건
			// 합이 > 1000
			if (num%2 != 0) {
				sum += num;
			}
			if (sum > 1000) {
				System.out.println(num + " 더 할 때 1000을 넘습니다.");
				System.out.println("초과된 값은" + sum + "입니다.");
				break;
			}
			num++;
		}

	}

}
