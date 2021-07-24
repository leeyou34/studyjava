package ch02_4_print_the_variable_and_system;

public class KeyCodeExample1 {

	public static void main(String[] args) throws Exception{

//	[키보드로부터 입려된 내용을 변수에 젖아하고 출력하기]
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}
