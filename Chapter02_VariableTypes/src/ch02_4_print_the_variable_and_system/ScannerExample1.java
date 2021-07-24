package ch02_4_print_the_variable_and_system;

	import java.util.Scanner;

		public class ScannerExample1 {

			public static void main(String[] args) throws Exception {
				Scanner scanner = new Scanner(System.in); // new 가 들어가는 순간 객체가 된다. 우리가 쓸 수 있게 된다.
				String inputData;
				
				while(true) {
					inputData = scanner.nextLine();
					System.out.println("입력된 문자열: \"" + inputData + "\"");
					if(inputData.equals("q")) {
						break;
					}
				}
				System.out.println("종료");
				
	}

}
