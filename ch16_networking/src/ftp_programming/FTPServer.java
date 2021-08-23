package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FTPServer {
	private static final int PORT = 9001;
	
	public static void main(String[] args) {
		System.out.println();
		
		// input output stream
		InputStream in =null;
		OutputStream out =null;
		DataInputStream din =null;
		DataOutputStream dout =null;
		
		// socket
		ServerSocket serverSoc = null;
		Socket clientSoc = null;
		
		//host address
		String clientAddr = null;
			
			try {
				serverSoc = new ServerSocket(PORT);
				System.out.println(timeStamp() + "Client login is on loading...");
				System.out.println();
				
				clientSoc = serverSoc.accept();
				
				clientAddr = clientSoc.getInetAddress().getHostName();
				System.out.println(timeStamp() + clientAddr + "<-- connected");


				/*
				 *  receiver
				 */
				in = clientSoc.getInputStream();
				din = new DataInputStream(in);
				
				/*
				 *  sender
				 */
				out = clientSoc.getOutputStream();
				dout = new DataOutputStream(out);
				
				//stage 1: find out what kind of file the users need.
				String fileName = din.readUTF();
				
				//stage 2: find out the file and read the data 
				FileInputStream fin = new FileInputStream("resources\\" + fileName);
				
				
				//stage 3: read the file data and send the data
				System.out.println("sending file...");
				System.out.println();
				while(true) {
					//read
					int data = fin.read();
					if(data == -1) break;
				
					dout.write(data);
				}
				
				
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(din !=null) {
						din.close();
					} if (dout != null) {
						dout.close();
					} if (clientSoc != null) {
						clientSoc.close();
					} if (serverSoc != null) {
						serverSoc.close();
					}
				} catch(IOException ex) {
					ex.printStackTrace();
				}
			}
	}
	private static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
}
