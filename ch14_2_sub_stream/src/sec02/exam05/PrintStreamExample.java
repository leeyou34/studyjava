package sec02.exam05;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[Print sub stream]");
		ps.println("it's like");
		ps.println("how printer prints");
		ps.println("data would be output.");
		
		ps.flush();
		ps.close();
	}

}
