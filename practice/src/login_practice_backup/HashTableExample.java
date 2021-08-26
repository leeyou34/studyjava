/*
 * Date:  2021-08-26
 * Author: Thomas
 * 
 * Objective:
 * 	1.로그인 과정을 구현하기. 
 * 		과정단계: 로그인 -> 입력정보 일치 -> 로그인 성공
 * 
 * TODO:
 * 	1.하기의 선언된 class들은 추후 다시 수정할 것
 * 	2.하기의 선언된 main mathod는 추후 없어질 수 있음
 * 	3.중첩 클래스 메소드 수정 필요 할 수 있음...
 *  4.하기 HashTableExample은 로그인 과정을 담고 있음 
 * 
 * Reference:
 * 	page @ 578
 */

package login_practice_backup;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");	//		1.map.put 이라고 사용된 총 4개의 줄은 아이디와 비밀번호를 미리 저장하였음
		map.put("summer", "123");	//		2.이 라인들은 사용하지 않을 것임
		map.put("fall", "1234");	//		3.이 아이디와 비밀번호는 .txt 파일에서 읽어서 적용할 예정.
		map.put("winter", "12345");	//		4.현재 상황에서는 구현 기능을 먼저 이해 할 것.
		
		Scanner scanner = new Scanner(System.in);	//		5.키보드로부터 입력된 내용을 받기 위해 생성하였음.
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디: ");
			String id =scanner.nextLine();	//		6.키보드로 입력한 아이디를 얻는다.
			System.out.println("비밀번호: ");
			String password =scanner.nextLine();	//		7.키보드로 입력한 비밀번호를 얻는다.
			System.out.println();
			
			if(map.containsKey(id)) {	// 		8.아이디인 키가 존재하는지 확인
				if(map.get(id).contentEquals(password)) {
				System.out.println("로그인이 되었습니다.");
				break;
				} else {
					System.out.println("비밀번호가  일치하지 않습니다.");
				} 
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		
	}

}

				/***
				 * 실행결과
				 * 1.아이디와 비밀번호를 입력해주세요.
				 * 2.아이디: spring
				 * 3.비밀번호: 12
				 * 4.로그인되었습니다.
				 ***/ 
 
