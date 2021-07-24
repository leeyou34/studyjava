package ch02_1_variable;

	public class VariableScopeExample {
		// 패키지 내에 VariableScopeExample이라는 클래스를 선언한다.
		public static void main(String[] args) {
		// 메인이라는 문자열[] 논의 메서드를 선언한다. 
			int v1=15; // 정수형 변수는 v1이며 v1값은 15이다.
			if(v1>10) { // 만약 v1 값이 > 정수 10보다 클 경우
				int v2; //정수형 변수는 v2이다.
				v2 = v1 -10; //v2 변수는 v1 -10으로 구성되어있다.
			}
			//int v3 = v1 + v2 + 5;// 정수형 변수 v3은 v1변수 v2변수 그리고 값 5를 합한 값이다.
	}
}
