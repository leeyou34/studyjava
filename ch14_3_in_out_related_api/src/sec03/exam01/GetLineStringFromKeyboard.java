package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.print("type: ");
			String lineStr = br.readLine();
			if(lineStr.contentEquals("q") || lineStr.contentEquals("quit"))break;
			System.out.print("typed content: " + lineStr );
			System.out.println();
		}
		
		br.close();
	}
}
