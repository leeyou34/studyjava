package socket_programming;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	public static final int PORT = 10001;
	
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("Client access is on loading.");
		
		Socket client =server.accept();
		
		System.out.println(client.getInetAddress().getHostName()
				+ "has logged in.");
		
		OutputStream out = client.getOutputStream();
		OutputStreamWriter outw = new OutputStreamWriter(out);
		PrintWriter pw = new PrintWriter(outw);
		
		FileInputStream fin =null;
		DataOutputStream dout = new DataOutputStream(out);
		
		/*
		 *  resource auto publishing
		 */
		File rescs = new File("resources\\");
		System.out.println(rescs.list().length + "amount of files exists.");
		
		String filePath = null;
		for(String file : rescs.list()) {
			// file information (name/memory) get
			filePath = rescs.getName()+"\\"+file;
			File sendFile = new File(filePath);
			System.out.println(sendFile.getName() + "sending...");
			
			pw.println(sendFile);
			pw.flush();
			pw.println(sendFile.length());
			pw.flush();
			
			fin = new FileInputStream(file);
			int cnt = 0;
			for(int i=0; i<sendFile.length(); i++) {
				// read the file
				int data = fin.read();
				// write the file
				dout.write(data);
				if(cnt % 3000 ==0) {System.out.print("");}
				cnt++;
			}
			System.out.println("Completed.\n");
		}
		
		fin.close();
		dout.close();
		pw.close();
		client.close();
		server.close();
		
		System.out.println();
		System.out.println("file blah service programming is finished.");
		//	System.out.println(filePath);
		}
		
		
	}

