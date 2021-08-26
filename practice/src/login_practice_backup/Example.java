/*
 * Date:  2021-08-26
 * Author: Thomas
 * 
 * Objective:
 * 	1. 로그인 과정을 구현하기. 
 * 		과정단계: 로그인 -> 입력정보 일치 -> 로그인 성공
 * 
 * TODO:
 * 	1. 하기의 선언된 class들은 추후 다시 수정할 것
 * 	2. 하기의 선언된 main mathod는 추후 없어질 수 있음
 * 	3. 중첩 클래스 메소드 수정 필요 할 수 있음...
 * 	4. 하기Example은 txt 파일안에 있는 ID와 비밀번호를 불러들이려고 함.
 * 
 * Reference:
 * 	https://www.python2.net/questions-39846.htm
 */

package login_practice_backup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("C:/Dev211/studyjava/practice/Userinfo/userinfo.txt")); // 상황에 따라 내부에 있는 String 파일 디렉토리는 바꾸면 됨...
            String line = reader.readLine();
            while (line != null) {
                String[] lineParts = line.split(":");
                System.out.println("user : " + lineParts[0]);
                System.out.println("password : " + lineParts[1]);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 