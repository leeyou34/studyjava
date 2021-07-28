package method;

public class Test03WithInstructor {

	public static void main(String[] args) {
		// 1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력,
		//그 수들의 총합을 출력...
		// (while)문 이용
		
		int num = 1;
		int sum = 0; // be sure make the sum value to be initalized.
		
		while (num <= 1000) {
			if (num%2 == 0 && num%7 == 0) {
			System.out.println(num);
			sum += num;
			
			}
		}
		
		System.out.println("총합: " + sum);
	}

}
