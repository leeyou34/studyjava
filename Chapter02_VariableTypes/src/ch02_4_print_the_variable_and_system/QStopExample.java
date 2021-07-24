package ch02_4_print_the_variable_and_system;

public class QStopExample { //QstopExample 변수 클래스를 선언한다.
	public static void main(String[] args) throws Exception{ //문자열 형태의 논의할 리터럴 값을 지닌 메인 메소드를 선언한다. 그리고 예외 처리가 있다 
		int keyCode; // keyCode라는 정수형 타입의 변수를 선언한다.
		
		while(true) { //만약에,조건문 while, 참일 경우 변수 keyCode는 System.in.Read() 메서드를 읽는다. 
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode); // "keyCode: " + keycode를 새로운 행에 출력하라.
			if(keyCode == 113) { // == 연산자를 >= 바꾸면.. 113보다 더 큰 int keyCode를 넣을 시 프로그램이 종료한다.
				break; // 만약에, 조건문 if, keyCode 변수가 113에 맞다면, break...즉 중단해라.
			}
		}
	
		System.out.println("종료"); //그리고 "종료"라는 리터럴을 새로운 행에 출력하라.
	}
}


/******************************
* System.in.read()의 단점은 키코드를 하나씩 읽기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없다.
* 그리고 키보드로부터 입력된 내용을 통 문자열로 읽지 못한다.
* 그래서 자바는 Scanner라는 클래스를 제공한다.
********************************/