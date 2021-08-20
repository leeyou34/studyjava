package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	
	
	public static String path = "C:/Temp/doc1.txt";
	
	public static void main(String[] args) throws Exception {
		write("char conversion stream will be used.");
		String data = read();
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/tst1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}

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
