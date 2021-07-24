package ch02_4_print_the_variable_and_system;

public class QStopExample1 {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode ==113) {
				break;
			}
		}

	System.out.println("Á¾·á");
	}
}