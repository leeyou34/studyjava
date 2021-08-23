package socket_programming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	public static final String IP = "192.168.0.252";
	public static final int PORT = 10001;
	
	public static void main(String[] args) throws UnknownHostException, IOException{
		
		Socket socket = new Socket(IP, PORT);
		
		InputStream in = socket.getInputStream();
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(inr);
		
		DataInputStream din = new DataInputStream(in);
		FileOutputStream fout = null;
		
		while(true) {
			// file name receiving
			String strline = br.readLine();
			String strlen = br.readLine();
			
			if(strline == null) break;
			System.out.println(strline + "file receiving..");
			System.out.println("(file size: " + strlen + ")");

			String path = "C:/Temp/Download/" + strline;
			fout = new FileOutputStream(path);
			
			int cnt = 0;
			for(int i=0; i < Integer.parseInt(strlen); i++) {
				// read the file
				int data = din.read();
				// write the file
				fout.write(data);
				if(cnt % 3000 ==0) {System.out.print("■");}
				cnt++;
			}
			System.out.println("Completed.\n");
		}

	}
}
