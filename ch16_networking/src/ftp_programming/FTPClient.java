package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FTPClient {
	public static final String IP = "localhost";
	//public static final String IP ="127.0.0.1";
	public static final int PORT =9001;
	
	public static void main(String[] args) {
		System.out.println();
		
		// input output stream
		InputStream in =null;
		OutputStream out =null;
		DataInputStream din =null;
		DataOutputStream dout =null;
		
		FileOutputStream fos = null;
		Scanner scan = null;
		
		Socket socket = null;
		
		try {
			socket = new Socket(IP, PORT);
			scan = new Scanner(System.in);
			
			in = socket.getInputStream();
			din = new DataInputStream(in);
			
			out = socket.getOutputStream();
			dout = new DataOutputStream(out);		
			
			menuDisplay();
			String fileName = scan.nextLine();
	
			dout.writeUTF(fileName);
			System.out.println(timeStamp() + "requested on file server.");
			System.out.println();
			
			System.out.println("File receiving...");
			System.out.println();
			
			
			fos = new FileOutputStream("C:/Temp/" + fileName);
			while(true) {
				//read
				int data = din.read();
				if(data ==-1) break;
				//write
				fos.write(data);
			}
			System.out.println();
			System.out.println(timeStamp() + "file download completed.");
			System.out.println();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(din !=null) {
				din.close();}
				if (dout != null) {
				dout.close();}
				if (fos != null) {
				fos.close();}
				if (socket != null) {
				socket.close();}
		} catch(IOException ex) {
			ex.printStackTrace();}
		}
}
		private static void menuDisplay() {
			System.out.println();
			System.out.println("─────────────────────");
			System.out.println();
			System.out.println(" input the file that needs(filename.identifier");
			System.out.println();
			System.out.println(" [1] aaa.txt [2] bbb.txt [3]ccc.txt [4] image.jpg");
			System.out.println("─────────────────────");
			System.out.println();
			System.out.println("select -> ");
		}
	private static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
}
		
		