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
 *  4.하기 ReadLineExample은 txt 파일내에 문자열을 출력하는 기능을 담고 있음 
 * 
 * Reference:
 * 	page @ 622
 */package login_practice_backup;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(
			ReadLineExample.class.getResource("language.txt").getPath()
		);
		
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
		}
		
		br.close();
	}
}
