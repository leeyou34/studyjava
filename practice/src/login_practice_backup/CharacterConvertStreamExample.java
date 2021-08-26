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
 *  4.하기 CharacterConvertStreamExample은 txt 파일내에 문자열을 출력하는 기능을 담고 있음 
 * 
 * Reference:
 * 	page @ 618
 */
package login_practice_backup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	
	
	public static String path = "C:/Temp/doc1.txt";
	
	public static void main(String[] args) throws Exception {
		//write("char conversion stream will be used.");
		String data = read();
		System.out.println(data);
	}

//	public static void write(String str) throws Exception {
//		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
//		Writer writer = new OutputStreamWriter(fos);
//		writer.write(str);
//		writer.flush();
//		writer.close();
//	}

	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
	
}
