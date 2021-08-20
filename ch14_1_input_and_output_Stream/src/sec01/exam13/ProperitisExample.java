package sec01.exam13;

import java.util.Properties;

public class ProperitisExample {

	public static void main(String[] args) {
		/****
		 * [properties] read 외부설정파일
		 * 
		 * '=' ':' 로 연결되어있어야 함
		 * 주석라인은 첫 번째 문자가 '#' 이어야 한다.
		 * 경로 '/'
		 */
		
		String path = "src/input.txt";
		
		Properties settings = new Properties();
		
		try {
			settings.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(" file can't be found.");
			System.exit(0);
		}
		
		String eName = settings.getProperty("eng_name");
		System.out.println(eName);
		
		String kName = settings.getProperty("kor_name");
		System.out.println(kName);
		try {
			kName = new String(kName.getBytes("8859_1"), "EUC-KR");
		} catch (UnsupportedEncodingException e) {
			
		}
		System.out.println(kName);
	}
		//settings.load(new FileInputStream(file));
}
