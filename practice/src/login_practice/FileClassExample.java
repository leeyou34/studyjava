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
 * 	4. 하기 FileClassExample은 txt 파일안에 있는 내용을 불러들이려고 함.
 * 
 * Reference:
 * 	page @ 641
 */

package login_practice;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClassExample { // "곡정보를 출력" 하는 기능... 그전에 어떤 파일있는지 확인
		public static void main(String[] args) throws Exception{
			File dir = new File("C/Temp/images");			// File 객체 생성
			File file1 = new File("C:/Temp/file1.txt");		// File 객체 생성
			File file2 = new File("C:/Temp/file2.txt");		// File 객체 생성
			File file3 = new File("C:/Temp/file3.txt");		// File 객체 생성
			
			if(dir.exists() ==false) { dir.mkdirs(); }				// 파일 또는 폴더가 존재하지 않으면 생성
			if(file1.exists() ==false) { file1.createNewFile(); }	// 파일 또는 폴더가 존재하지 않으면 생성
			if(file2.exists() ==false) { file2.createNewFile(); }	// 파일 또는 폴더가 존재하지 않으면 생성
			if(file3.exists() ==false) { file3.createNewFile(); }	// 파일 또는 폴더가 존재하지 않으면 생성
			
			File temp = new File("MusicFile\\"); // File의 매개변수는... 해당 폴더 내에 있는 모든 파일 부른다.
			File[] contents = temp.listFiles(); // 위의 매개변수가"C:/Temp"라고 가정시 Temp 폴더의 내용 목록을 File 배열로 얻음
			
			System.out.println("시간\t\t\t형태\t\t크기\t\t이름");
			System.out.println("----------------------------------------------------------");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			for(File file : contents) {
				System.out.print(sdf.format(new Date(file.lastModified())));	// 화살표 방향부터 파일 또는 폴더 정보를 출력  ↓
				if(file.isDirectory()) {
					System.out.print("\t<DIR>\t\t\t" + file.getName());
				} else {
					System.out.print("\t\t\t" + file.length() + "\t" + file.getName());// 화살표 방향까지 파일 또는 폴더 정보를 출력 ↑ 
				}
	 			System.out.println();
			}
		}
	}
/*******************
 * 파일 자체를 부르고자 하면 다음과 같은 코드 라인을 작성하면 된다.
 * 
 * 	1번 방법:
 * 	→ FileInputStream fis = new FileInputStream("C:/Temp/image.gif);
 * 
 * 	2번 방법:
 * 	→ File file = new File("C:/Temp/image.gif");
 * 	→ FileInputStream fis = new FileInputStream(file);
 * 
 *******************/
