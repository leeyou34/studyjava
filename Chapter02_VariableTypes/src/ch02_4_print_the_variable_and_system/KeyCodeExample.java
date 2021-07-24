package ch02_4_print_the_variable_and_system;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { // throws Exception는 System.in.read()에 대한 예외 처리 코드
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);

		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);
		
		

	}

}

/*******************
*put any character on console window first then numerical value shows.
*
*
*******************/