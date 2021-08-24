package practice;
//CrudPractice;

import java.util.Scanner;
/*
 *************[자바를 이용한 CRUD 연습용 게시판 v1.1]******************
 * 
 * **v1.0대비 업데이트 내용들
 * 1. 입력값이 매뉴얼 대로 오지 않았을때 예외처리 (문자, 배열범위 초과 등)
 * 2. 페이지 출력시 진짜 페이지 형식으로 출력하게 만들고 싶음 (얼추 비슷하게 완료)
 * 3. 배열을 자동으로 생성하게 만들고 싶음(완료)
 * 
 * *추가하고 싶은 기능들
 * 1. 일괄출력 기능 (하나씩 출력하기 너무 힘들다)
 * 2. 파일 input/output스트림 이용해서 스캐너통해 아이디, 비번 입력하면 파일이 따로 만들어지게 만들기
 * 3. 해당 로그인 정보 이용해서 권한 부여하고, 맵핑시켜서 로그인 가능하게 만들기
 * **********************************************************
 */


//View 부분(사용자가 볼 수 있고, 직접 데이터를 입력하는 부분)
public class Main {

	public static void main(String[] args) {
		
		Dmo2 dmo = new Dmo2();
		
		//스캐너 선언
		Scanner sc = new Scanner(System.in);
		//메뉴 출력 부분
		Loop: while(true) {
		System.out.println("**********************CRUD 게시판 프로토타입 v1.0**********************************");
		System.out.println("1.입력(Insert) | 2. 검색(Search) | 3. 수정(Update) | 4. 삭제(Delete) | 5.프로그램 종료 ");
		System.out.println("*****************************************************************************");
		System.out.print("원하시는 메뉴를 입력해 주세요. >>");
		String selection = sc.nextLine();
		
		//input 값 초기화
		int input = 0;
		//문자열 입력시 다시입력하도록 예외 처리
		try {
			 input = Integer.parseInt(selection);
		}catch(NumberFormatException e) { 
			System.out.println("1~5까지의 숫자 입력만 허용 됩니다. 올바른 숫자를 기입해 주세요.");
			continue;
		}
		
		//switch문
		//스위치문 자체를 try catch로 묶어서 모든 메서드들의 입력에서 NumberFormatException 발생시 처음으로 돌아가도록 설정함
		try {
			switch(input) {
			case 1:
				dmo.insert();
				break;
			case 2:
				dmo.search();
				break;
			case 3:
				dmo.update();
				break;
			case 4: 
				dmo.delete();
				break;
			case 5:
				System.out.println("프로그램을 종료 합니다.");
				break Loop;
				//1~5 정수 이외의 값이 입력되면 다시 조건문으로 돌아가도록 설정
			default :
				System.out.println("1~5까지의 숫자 입력만 허용 됩니다. 올바른 숫자를 기입해 주세요.");
				continue;
			}//switch 부분
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다. 처음부터 다시 입력해주세요.");
			continue;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("해당 페이지는 빈페이지 입니다.");
			continue;
		}
		
		System.out.println();
		} //While 부분
	}//main 메소드 부분

}//Main 클래스 부분