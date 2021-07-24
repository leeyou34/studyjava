package ch02_4_print_the_variable_and_system;

import java.util.Scanner;

public class VariableAndSystemMockingTest {

	public static void main(String[] args) {
//		// question 1.
//		String name = "감자바";
//		int age = 25;
//		//print.out.in "println" method
//		
//		String tel1 = "010", tel2 ="123", tel3 = "4567";
//		
//		
//		System.out.println(("이름: " + name)+ "\n");
//		System.out.println(("나이: " + age)+ "\n");
//		System.out.println(("전화: " + tel1 +"-"+ tel2 +"-"+ tel3)+ "\n");
//		
//		System.out.println("\n\n");
//		//print.out.in "print" method
//		System.out.print(("이름: " + name) + "\n\n");
//		System.out.print(("나이: " + age) + "\n\n");
//		System.out.print(("전화: " + tel1 +"-" + tel2 + "-"+ tel3)+ "\n\n");
//		
//		//print.out.in "printf" method
//		System.out.printf("이름: %s\n\n", name);
//		System.out.printf("나이: %d\n\n", age);
//		System.out.printf("전화: %s-%s-%s\n\n", tel1, tel2, tel3);
//	
//		System.out.println("\n\n");
//		
//		// make it summerize of prinf method
//		System.out.printf("이름: %s\n\n 나이: %d\n\n 전화: %s-%s-%s\n\n",  name, age, tel1, tel2, tel3);
//
//	}
//
//		//question2.
//
//		public static void printOneTimesA() {
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.print("첫번째 수: ");			
//			String strNum1 = scanner.nextLine();
//			
//			System.out.print("두번째 수: ");
//			String strNum2 = scanner.nextLine();
//			
//			int num1 = Integer.parseInt(strNum1);
//			int num2 = Integer.parseInt(strNum2);
//			int result = num1 + num2;
//			System.out.println("덧셈 결과: " + result);
//			
//		}
//	
//		//Question 3.
//		public static void printTwoTimesA() {
//		//	2021.07.23 내가 직접 짠 코드 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6 자리: ");
		String strNum2 = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String strNum3 = scanner.nextLine();
		
		strNum1 = "홍길동";
		strNum2 = "123456";
		strNum3 = "010-123-1234";
		System.out.printf("[입력된 내용]\n1. 이름:%s\n2. 주민번호 앞 6 자리: %s\n3. 전화번호: %s", strNum1, strNum2, strNum3);
		
//		System,
		// Answer for question 3.
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("[필수 정보 입력]");
//		System.out.print("1. 이름: ");
//		String name = scanner.nextLine();
//		
//		System.out.print("2. 주민번호 앞 6 자리: ");
//		String ssn = scanner.nextLine();
//		
//		System.out.print("3. 전화번호: ");
//		String tel = scanner.nextLine();
//		
//		System.out.println("입력된 내용]");
//		System.out.println("1. 이름: " + name);
//		System.out.println("2. 주민번호 앞 6자리: " + ssn);
//		System.out.println("3. 전화번호: " + tel);
//		
//		
		}
	
}